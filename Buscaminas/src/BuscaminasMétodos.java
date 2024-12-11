import java.util.Random;
import java.util.Scanner;

public class BuscaminasMétodos {
    public static int[] AsignaciónMina(int[][][] c, int cf, int cc, int nfc, int cm, int ccs, int[] rec) {
        Random rand = new Random();
        for (cf = 0; cf < nfc || cm == 0; cf++) {
            for (cc = 0; cc < nfc; cc++) {
                c[0][cf][cc] = (int) rand.nextInt(0, 4);
                c[1][cf][cc] = 10;
                if (c[0][cf][cc] < 3) {
                    c[0][cf][cc] = 0;
                    ccs++;
                } else {
                    c[0][cf][cc] = 9;
                    cm++;
                }
            }
        }
        rec[0] = ccs;
        rec[1] = cm;
        return rec;
    }
    public static void AsignaciónCercanía(int[][][] c, int cf, int cc, int nfc) {
        for (cf = 0; cf < nfc; cf++) {
            for (cc = 0; cc < nfc; cc++) {
                if (c[0][cf][cc] >= 9) {
                    if (cf > 0) {
                        if (cc > 0) {
                            c[0][cf - 1][cc - 1]++;
                        }
                        c[0][cf - 1][cc]++;
                        if (cc < c[0].length-1) {
                            c[0][cf - 1][cc + 1]++;
                        }
                    }
                    if (cf < c[0].length-1) {
                        if (cc > 0) {
                            c[0][cf + 1][cc - 1]++;
                        }
                        c[0][cf + 1][cc]++;
                        if (cc < c[0].length-1) {
                            c[0][cf + 1][cc + 1]++;
                        }
                    }
                    if (cc > 0) {
                        c[0][cf][cc - 1]++;
                    }
                    if (cc < c[0].length-1) {
                        c[0][cf][cc + 1]++;
                    }
                }
            }
        }
    }
    public static void AsignaciónImpresión(int[][][] c, int cf, int cc, int nfc) {
        for (cf = 0; cf < nfc; cf++) {
            for (cc = 0; cc < nfc; cc++) {
                if (c[0][cf][cc] == 0) {
                    if (cf > 0) {
                        c[1][cf-1][cc] = 11;
                        if (cc > 0) {
                            c[1][cf - 1][cc - 1] = 11;
                        }
                        if (cc < c[0].length-1) {
                            c[1][cf - 1][cc + 1] = 11;
                        }
                    }
                    if (cf < c[0].length-1) {
                        c[1][cf+1][cc] = 11;
                        if (cc > 0) {
                            c[1][cf + 1][cc - 1] = 11;
                        }
                        if (cc < c[0].length-1) {
                            c[1][cf + 1][cc + 1] = 11;
                        }
                    }
                    if (cc > 0) {
                        c[1][cf][cc-1] = 11;
                    }
                    if (cc < c[0].length-1) {
                        c[1][cf][cc+1] = 11;
                    }
                    c[1][cf][cc] = 11;
                }
            }
        }
    }
    public static void Juego(int[][][] c, int cf, int cc, int nfc, int cm, int ccs, int cb, int cmv) {
        Scanner sc = new Scanner(System.in);
        for (boolean activarfin = false, fin = false; !fin;) {
            for (cf = 0; cf < nfc; cf++) {
                for (cc = 0; cc < nfc; cc++) {
                    if (c[1][cf][cc] == 12) {
                        System.out.print("  P  ");
                    }
                    else {
                        if (c[1][cf][cc] == 11) {
                            System.out.print("  " + c[0][cf][cc] + "  ");
                        }
                        else {
                            System.out.print("     ");
                        }
                    }
                }
                System.out.println("\n");
            }
            if (!activarfin) {
                if (cm != 1) {
                    System.out.print("Quedan "+cm+" minas");
                }
                else {
                    System.out.print("Queda 1 mina");
                }
                if (cb > 0) {
                    if (cb > 1) {
                        System.out.println(" y has puesto "+cb+" banderas.");
                    }
                    else {
                        System.out.println(" y has puesto 1 bandera.");
                    }
                }
                else {
                    System.out.println(". ");
                }
                System.out.println("¿Seleccionar o poner bandera?");
                for (int scfc, sccc, scfb, sccb, acc = 3; acc > 2; ) {
                    acc = sc.nextInt();
                    if (acc == 1) {
                        for (scfc = 99999, sccc = 99999; scfc > nfc || sccc > nfc;) {
                            System.out.println("Selecciona una casilla.\nColumna y fila...");
                            sccc = sc.nextInt() - 1;
                            scfc = sc.nextInt() - 1;
                            if (sccc > nfc && scfc <= nfc) {
                                System.out.println("La columna introducida está fuera del tablero.\n");
                            }
                            else if (scfc > nfc && sccc <= nfc) {
                                System.out.println("La fila introducida está fuera del tablero.\n");
                            }
                            else if (sccc > nfc && scfc > nfc ) {
                                System.out.println("La columna y fila introducidas están fuera del tablero.\n");
                            }
                        }
                        if (c[1][scfc][sccc] == 10) {
                            c[1][scfc][sccc] = 11;
                            if (c[0][scfc][sccc] > 8) {
                                fin = true;
                                System.out.println("¡EN LA COLUMNA "+(sccc+1)+" Y FILA "+(scfc+1)+" HABÍA UNA MINA!");
                            }
                            acc = 0;
                        }
                        else {
                            System.out.println("\nEsa casilla ya está descubierta o está marcada con una bandera.\n");
                        }
                    }
                    if (acc == 2) {
                        for (scfb = 99999, sccb = 99999; scfb > nfc || sccb > nfc;) {
                            System.out.println("Pon una bandera.\nColumna y fila...");
                            sccb = sc.nextInt() - 1;
                            scfb = sc.nextInt() - 1;
                        }
                        if (c[1][scfb][sccb] == 10) {
                            c[1][scfb][sccb] = 12;
                            cb++;
                            cm--;
                            acc = 0;
                            if (c[0][scfb][sccb] > 8) {
                                cmv++;
                            }
                        }
                        else {
                            if (c[1][scfb][sccb] == 12) {
                                c[1][scfb][sccb] = 10;
                            }
                            else {
                                System.out.println("\nEsa casilla ya está descubierta.\n");
                                cb--;
                            }
                        }
                    }
                }
                if (ccs+cmv == Math.pow(nfc,2)) {
                    activarfin = true;
                    System.out.println("\n¡HAS GANADO!\n");
                    for (cf = 0; cf < nfc; cf++) {
                        for (cc = 0; cc < nfc; cc++) {
                            if (c[0][cf][cc] < 9) {
                                c[1][cf][cc] = 11;
                            }
                            else {
                                c[1][cf][cc] = 12;
                            }
                        }
                    }
                }
            }
            else {
                fin = true;
            }
        }
    }
}

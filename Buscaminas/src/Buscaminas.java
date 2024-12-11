import java.util.Scanner;

public class Buscaminas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-~-~-~-~-~-~-BUSCAMINAS-~-~-~-~-~-~-\n");
        System.out.println("Para seleccionar casillas, utiliza 1, y para ponder banderas, utiliza 2.\n");
        System.out.println("Dimensión del tablero:");

        int cf = 0, cc = 0, ccs = 0, cm = 0, cb = 0, cmv = 0, nfc = sc.nextInt();
        //cf es la cuenta de las filas
        //cc es la cuenta de las columnas
        //ccs es la cuenta de las casillas seleccionadas (casillas que no son minas y están descubiertas)
        //cm es la cuenta de las minas
        //cb es la cuenta de las banderas
        //cmv es la cuenta de minas verdadera (al contrario que cm, esta sólo baja si la bandera puesta está sobre una mina)
        //nfc es la dimensión del tablero (número de filas y columnas)

        int[] rec = new int[2];
        //rec recoge los datos de los métodos para poder actualizar las variables

        int[][][] c = new int[2][nfc][nfc];
        //c es la matriz tridimensional que actúa como dos bidimensionales, la 0 es el tablero y la 1 es la información de la casilla

        //ASIGNACIÓN DE CASILLA MINA O CASILLA VACÍO
        //Se rellena la primera matriz con datos aleatorios del 0 al 3
        //Los valores 0, 1 y 2 corresponden a casillas vacías y se les reinicia el valor a 0
        //El valor 3 corresponde a las minas y se les reinicia el valor a 9
        //El porcentaje de vacío es del 75% y el de minas el 25%
        //Si no se genera niguna mina se ejecuta de nuevo hasta que haya al menos una (sólo relevante para tableros muy pequeños)
        BuscaminasMétodos.AsignaciónMina(c,cf,cc,nfc,cm,ccs,rec);
        ccs = rec[0];
        cm = rec[1];

        //ASIGNACIÓN DE NÚMERO DE MINAS CERCANAS
        //Se les asigna el valor correspondiente a las casillas vacías que tengan minas alrededor
        BuscaminasMétodos.AsignaciónCercanía(c,cf,cc,nfc);

        //ASIGNACIÓN PARA LA IMPRESIÓN
        //La segunda matriz controla la impresión de las casillas, el valor por defecto es 10 (no se imprime)
        //A todas las casillas que no tengan una mina cerca se les asigna el valor que corresponde a la impresión (11)
        //También se le asigna este valor a las casillas que estén alrededor de estas últimas
        BuscaminasMétodos.AsignaciónImpresión(c,cf,cc,nfc);

        //IMPRESIÓN Y ACCIÓN
        //Este es el bucle que se ejecuta durante el juego
        //Controla la impresión del tablero y la acción (Seleccionar o poner bandera)
        BuscaminasMétodos.Juego(c,cf,cc,nfc,cm,ccs,cb,cmv);
    }
}
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres usar un string de ejemplo personalizado? (ENTER para utilizar por defecto)");
        String s = sc.nextLine();
        if (s.isEmpty()) {
            s = "Esto es un ejemplo";
        }
        System.out.println("Elige un método de String (1-10) (11 para salir)");

        for (int c = 0; c != 11;) {
            c = sc.nextInt();
            sc.nextLine();//leer el enter
            switch (c) {
                case 1:
                    System.out.println("-Método charAt(int índice)-\nDevuelve el caracter de la posición 'índice' (La primera posición es 0)\nIntroduzca un número");
                    int s1 = sc.nextInt();
                    System.out.println("El caracter de la posición "+ s1 +" en el string '"+s+"'  es '"+s.charAt(s1)+"'");
                    break;
                case 2:
                    System.out.println("-Método concat(String ejemplo)-\nDevuelve la cadena con 'ejemplo' añadido al final\nIntroduzca una cadena de texto");
                    String s2 = sc.next();
                    System.out.println("El string '"+s+"' concatenado con '"+s2+"' devuelve '"+s.concat(s2)+"'");
                    break;
                case 3:
                    System.out.println("-Método indexOf(int caracterejemplo)-\nDevuelve la primera ocurrencia de 'caracterejemplo' (si no se encuentra devuelve -1)\nIntroduzca un caracter para buscar en '"+s+"'");
                    char s3 = sc.next().charAt(0);
                    System.out.println("La primera ocurrencia del caracter '"+s3+"' en el string '"+s+"' es "+s.indexOf(s3));
                    break;
                case 4:
                    System.out.println("-Método compareTo(String ejemplo)-\nCompara un string con 'ejemplo', devuelve 0 si son iguales, <1 si es menor y >1 si es mayor (utiliza el valor numérico de los caracteres para comparar)\nIntroduzca una cadena de caracteres");
                    String s4 = sc.nextLine();
                    System.out.println("Al comparar el string '"+s4+"' con '"+s+"' el resultado es: "+s4.compareTo(s));
                    break;
                case 5:
                    System.out.println("-Método replace(char antiguocaracter, char nuevocaracter)-\nCambia todas las ocurrencias de 'antiguocaracter' por 'nuevocaracter'\nIntroduzca un caracter a cambiar en '"+s+"' y por el que será reemplazado");
                    char s5 = sc.next().charAt(0);
                    char s52= sc.next().charAt(0);
                    System.out.println("Se ha reemplazado el caracter '"+s5+"' por '"+s52+"' en la cadena '"+s+"', dando como resultado '"+s.replace(s5, s52)+"' ");
                    break;
                case 6:
                    System.out.println("-Método lastIndexOf(int caracterejemplo)-\nDevuelve la última ocurrencia de 'caracterejemplo' (si no se encuentra devuelve -1)\nIntroduzca un caracter");
                    char s6 = sc.next().charAt(0);
                    System.out.println("La última ocurrencia del caracter '"+s6+"' en el string '"+s+"' es "+s.lastIndexOf(s6));
                    break;
                case 7:
                    System.out.println("-Método length()-\nDevuelve la longitud del string\nLa longitud del string '"+s+"' es "+s.length());
                    break;
                case 8:
                    System.out.println("-Método substring(int índicecomienzo)-\nDevuelve la cadena desde 'índicecomienzo' hasta el final del string\nIntroduzca un número");
                    int s8 = sc.nextInt();
                    System.out.println("La cadena de caracteres desde la posición "+ s8 +" hasta el final en el string '"+s+"' es '"+s.substring(s8)+"'");
                    break;
                case 9:
                    System.out.println("-Método substring(int índicecomienzo, int índicefinal)-\nDevuelve la cadena desde 'índicecomienzo' hasta 'índicefinal'\nIntroduzca un número para empezar y otro para terminar");
                    int s9 = sc.nextInt();
                    int s91 = sc.nextInt();
                    System.out.println("La cadena de caracteres desde la posición "+s9+" hasta la posición "+s91+" en el string '"+s+"' es '"+s.substring(s9, s91)+"'");
                    break;
                case 10:
                    System.out.println("-Método toLowerCase()-\nDevuelve el string en minúsculas\nEl string '"+s+"' en minúsculas es '"+s.toLowerCase()+"'");
                    break;
            }
            if ( c > 11 ) {
                System.out.println("Introduzca un índice válido");
            }
        }
        System.out.println("-Finalizado-");
    }
    
}

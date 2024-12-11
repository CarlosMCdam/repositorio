import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres usar un string de ejemplo personalizado? (ENTER para utilizar por defecto)");
        StringBuffer s = new StringBuffer(sc.nextLine());
        if (s.isEmpty()) {
            s = new StringBuffer("Esto es un ejemplo");
        }
        System.out.println("Elige un método de StringBuffer (1-5) (6 para salir)");

        for (int c = 0; c != 6;) {
            c = sc.nextInt();
            switch (c) {
                case 1:
                    System.out.println("-Método StringBuffer append(char caracter)-\nAñade 'caracter' al stringbuffer (El método está sobrecargado y, además de char, puede recibir String, Object, int...)");
                    char c1 = sc.next().charAt(0);
                    System.out.println("El resultado de añadir '"+c1+"' a '"+s+"' es '"+s.append(c1)+"'");
                    break;
                case 2:
                    System.out.println("-Método capacity()-\nDevuelve el número de caracteres que puede contener sin utilizar más memoria\nLa capacidad de '"+s+"' es de "+s.capacity());
                    break;
                case 3:

            }
        }
    }
}

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca caracteres");
        String s = sc.next();

        /*System.out.println(s.length());//4 si he introducido por ejemplo "hola"
        s = s + "123";
        System.out.println(s.length());//7*/

        boolean f = true;
        for (int i = 0, i2 = s.length(); i < s.length() / 2; i++, i2--) {
            if (s.charAt(i) != s.charAt(i2 - 1)) {
                i = s.length() / 2;
                f = false;
            }
        }
        if (f) {
            System.out.println(s + " es un palíndromo");
        } else {
            System.out.println(s + " no es un palíndormo");
        }
    }
}

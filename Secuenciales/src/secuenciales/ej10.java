package secuenciales;

import java.util.Scanner;

public class ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		for (c = 0;c<32 || c>255;) {
			System.out.println("Introduzca un número entre 32 y 255");
			Scanner l = new Scanner(System.in);
			c = l.nextInt();
		}
		System.out.println("El valor "+c+" en ASCII corresponde al caracter "+(char)c);
	}

}

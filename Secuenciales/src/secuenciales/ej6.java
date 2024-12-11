package secuenciales;

import java.util.Scanner;

public class ej6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// versión con double (funciona mal) y versión con float (funciona)
		float c,ci;
		int cu;
		System.out.println("Introduzca la cantidad de euros");
		Scanner l = new Scanner(System.in);
		for (c = l.nextFloat(),ci = c,cu = 0;c >= 10;cu++) {
			c = c - 10;
		}
		System.out.print(ci+" son "+cu+" billetes de 10 euros, ");
		for (cu = 0;c >= 5;cu++) {
			c = c - 5;
		}
		System.out.print(cu+" billetes de 5 euros, ");
		for (cu = 0;c >= 0.5;cu++) {
			c = c - 0.5f;
		}
		System.out.print(cu+" monedas de 50 céntimos, ");
		for (cu = 0;c >= 0.1;cu++) {
			c = c - 0.1f;
		}
		System.out.print(cu+" monedas de 10 céntimos, ");
		for (cu = 0;c >= 0.05;cu++) {
			c = c - 0.05f;
		}
		System.out.print(cu+" monedas de 5 céntimos y ");
		for (cu = 0;c >= 0.01;cu++) {
			c = c - 0.01f;
		}
		System.out.print(cu+" monedas de 1 céntimo.");
	}

}

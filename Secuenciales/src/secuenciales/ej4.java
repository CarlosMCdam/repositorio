package secuenciales;

import java.security.DrbgParameters.NextBytes;
import java.util.Scanner;

public class ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("Introduzca un número");
		Scanner l = new Scanner(System.in);
		n = l.nextInt();
		System.out.println("El cuadrado de "+n+" es "+Math.pow(n, 2));
	}

}

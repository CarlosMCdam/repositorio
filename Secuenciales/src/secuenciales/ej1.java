package secuenciales;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		int n1,n2;
		System.out.println("Introduce dos números");
		Scanner l = new Scanner(System.in);
		n1 = l.nextInt();
		n2 = l.nextInt();
		System.out.println("La suma de "+n1+" y "+n2+" da "+(n1+n2));
	}

}

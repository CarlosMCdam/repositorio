package secuenciales;

import java.util.Scanner;

public class ej7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		Scanner l = new Scanner(System.in);
		System.out.println("Introduzca el radio de una circunferencia");
		r = l.nextInt();
		System.out.println("La longitud de la circunferencia es de "+2*Math.PI*r+" y su área es de "+Math.PI*Math.pow(r, 2));
	}

}

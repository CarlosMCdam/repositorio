package secuenciales;

import java.util.Scanner;

public class ej8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c1,c2;
		System.out.println("Introduzca el valor de dos lados de un rectángulo");
		Scanner l = new Scanner(System.in);
		c1 = l.nextFloat();
		c2 = l.nextFloat();
		System.out.println("El perímetro del rectángulo es de "+(2*c1+2*c2)+" y el área es de "+c1*c2);
		System.out.println("La diagonal del rectángulo es de "+(Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2)))+" y el área3 del triángulo que forma con los dos lados es de "+(c1+c2)/2);
	}

}
package ejercicios;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,c,i,vector[] = new int[15];
		Scanner l = new Scanner(System.in);
		System.out.println("Introduzca 15 números");
		for( i = 0; i < vector.length; i++) {
			vector[i] = l.nextInt();
		}
		System.out.println("¿Cuántos números debería sumar?");
		n = l.nextInt();
		for( c = 0, i = 0; i < n; i++) {
			c = c+vector[i];
		}
		System.out.println("La suma de los 5 primeros números es "+c);
		for ( i = 0; i < vector.length; i++) {
			System.out.print(vector[i]+" ");
		}
	}

}

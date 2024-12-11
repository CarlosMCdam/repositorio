package bucles;

import java.util.Scanner;

public class Ej30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c,q;
		System.out.println("Introduce números. El programa leerá hasta que la suma de estos supere 50");
		Scanner l = new Scanner(System.in);
		for ( c=0, q=0; q<=50 ;) {
			c = l.nextInt();
			q = q+c;
		}
		System.out.println("La suma de todos ellos da "+q);
	}

}

package bucles;

import java.util.Scanner;

public class Ej27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0, nc, c;
		Scanner	l = new Scanner(System.in);
		while (n<=0) {
			System.out.println("¿Cuántos números vas a introducir?");
			n = l.nextInt();
		}
		System.out.println("Introduce "+n+" números");
		c = l.nextInt();
		nc = c;
		for ( nc = 0 ; n>1 ; n-- ) {
			c = l.nextInt();
			/*if (nc==0)
				nc=c;*/
			if (c<nc) {
				nc=c;
			}
		}
		System.out.println("El número más alto es "+nc);
	}
}

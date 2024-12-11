package condicionales;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d,v;
		System.out.println("Introduzca un dividendo y divisor");
		Scanner l = new Scanner(System.in);
		d = l.nextInt();
		v = l.nextInt();
		if (d%v==0) {
			System.out.println("DIVISIBLES");
		}
		
	}

}

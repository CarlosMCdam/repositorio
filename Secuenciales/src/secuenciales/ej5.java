package secuenciales;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class ej5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c1,c2;
		System.out.println("Introduzca el valor de dos catetos");
		Scanner l = new Scanner(System.in);
		c1 = l.nextInt();
		c2 = l.nextInt();
		System.out.println("La hipotenusa del triángulo con catetos "+c1+" y "+c2+" es "+(Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2))));
	}

}

package secuenciales;

import java.util.Scanner;

public class ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p,c;
		System.out.println("¿Cuánto cuesta el producto?");
		Scanner l = new Scanner(System.in);
		p = l.nextInt();
		System.out.println("¿Qué cantidad del producto tienes?");
		c = l.nextInt();
		System.out.println("El total de la compra es de "+(p*c));
	}

}

package condicionales;

import java.util.Scanner;

public class ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float c;
		int d;
		System.out.println("Introduzca el importe de la compra y el descuento a calcular");
		Scanner l = new Scanner(System.in);
		c = l.nextFloat();
		d = l.nextInt();
		if (c>100) {
			System.out.println("El total de la compra, con 15% fijo de descuento para compras mayores de 100€, es de "+(c*85/100)+"€");
		}
		else {
			System.out.println("El total de la compra, con "+d+"% de descuento, es de "+(c*(100-d)/100)+"€");
		}
	}

}

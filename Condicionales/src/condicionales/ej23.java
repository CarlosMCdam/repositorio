package condicionales;

import java.util.Scanner;

public class ej23 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String d = new String();
		int c = 0;
		Scanner l = new Scanner(System.in);
		System.out.println("¡Bienvenido al concurso! Trate de contestar correctamente las siguientes preguntas:\n");
		System.out.println("¿Descubrió Cristóbal Colón América?");
		d = l.nextLine(); 
		while (!d.equalsIgnoreCase("Verdadero") && !d.equalsIgnoreCase("Falso")) {
			System.out.println("Para responder, introduzca ´Verdadero´ o ´Falso´");
			d = l.nextLine();
		}
		if (d.equalsIgnoreCase("Verdadero")) {
			System.out.println("¡Correcto!\n");
			c++;
		}
		else {
			System.out.println("¡Incorrecto!\n");
		}
		System.out.println("¿Ocurrió la Guerra de Independencia en 1808?");
		d = l.nextLine(); 
		while (!d.equalsIgnoreCase("Verdadero") && !d.equalsIgnoreCase("Falso")) {
			System.out.println("Para responder, introduzca ´Verdadero´ o ´Falso´");
			d = l.nextLine();
		}
		if (d.equalsIgnoreCase("Verdadero")) {
			System.out.println("¡Correcto!\n");
			c++;
		}
		else {
			System.out.println("¡Incorrecto!\n");
		}
		System.out.println("¿Fue The Doors un grupo de rock estadounidense?");
		d = l.nextLine(); 
		while (!d.equalsIgnoreCase("Verdadero") && !d.equalsIgnoreCase("Falso")) {
			System.out.println("Para responder, introduzca ´Verdadero´ o ´Falso´");
			d = l.nextLine();
		}
		if (d.equalsIgnoreCase("Verdadero")) {
			System.out.println("¡Correcto!\n");
			c++;
		}
		else {
			System.out.println("¡Incorrecto!\n");
		}
		System.out.println("Has acertado "+c+"/3 preguntas");
	}

}

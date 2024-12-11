package bucles;

import java.io.IOException;
import java.util.Scanner;

public class Ej23 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		int cu=0;
		System.out.println("Introduzca una frase");
		//Scanner l = new Scanner(System.in);
		for (  c=' ' ; c!='.'; ) {
			//cu = l.nextInt();
			c= (char)System.in.read();
			if (c==' ') {
				cu++;
			}
		}
		System.out.println("La frase contiene "+(cu+1)+" palabras");
	}

}

package bucles;

import java.io.IOException;

public class Ej29 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		char c;
		int cu;
		System.out.println("Introduce caracteres (Para terminar la lectura introduce un punto)");
		for ( cu = 0, c = 'c'; c!='.' ;) {
			 c = (char)System.in.read();
			 if ( c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
				cu++;
			}
		}
		System.out.println("Has introducido "+cu+" vocales");
	}

}

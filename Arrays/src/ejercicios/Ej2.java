package ejercicios;

public class Ej2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,origen[] = new int[11],destino[] = new int[11];
		for ( i = 0, j = 0; i < origen.length; i++ ) {
			origen[i] = (int)(Math.random()*100);
			if( origen[i]%2==0 && origen[i]>25 ) {
				destino[j] = origen[i];
				j++;
			} 
		}
		for ( i = 0; i < origen.length; i++ ) {
			System.out.print(origen[i]+" ");
		}
		System.out.println();
		for ( i = 0; i < j; i++ ) {
			System.out.print(destino[i]+" ");
		}
	}

}

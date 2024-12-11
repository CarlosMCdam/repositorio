package ejercicios;

public class Tridimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k,c[][][] = new int[4][4][4];
		int contador=0;
		for ( i = 0; i < c.length; i++ ) {
			for ( j = 0; j < c[i].length; j++ ) {
				for ( k = 0; k < c[i][j].length; k++ ) {
					c[i][j][k] = j;
					System.out.print(c[i][j][k]+" ");
					contador++;
				}
				System.out.println();
			}
			System.out.println();
		}
		System.out.println(contador+" elementos (4x4x4)");
	}

}

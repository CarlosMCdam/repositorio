package ejercicios;

public class Ej4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,c[][] = new int[10][10];
		for ( i = 0; i < c.length; i++ ) {
			if (i%2==0) {
				for ( j = 0; j < c.length; j++ ) {
					c[i][j] = 1;
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
			else {
				for ( j = 0; j < c.length; j++ ) {
					c[i][j] = 0;
					System.out.print(c[i][j]);
				}
				System.out.println();
			}
		}
	}

}

package ejercicios;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,marco[][] = new int[5][15];
		for ( i = 0; i < marco.length; i++) {
			for ( j = 0; j < marco[i].length; j++) {
				if ( i==0 || i==marco.length-1 || j==0 || j==marco[i].length-1) {
					System.out.print("1");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}

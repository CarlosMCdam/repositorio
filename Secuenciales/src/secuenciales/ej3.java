package secuenciales;

import java.util.Scanner;

public class ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2,n3;
		System.out.println("Introduce tres números");
		Scanner l = new Scanner(System.in);
		n1 = l.nextInt();
		n2 = l.nextInt();
		n3 = l.nextInt();
		System.out.println("(("+n1+"+"+n2+")/"+n3+") da como resultado "+(n1+n2)/n3);
	} 

}

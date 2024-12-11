package bucles;

import java.util.Random;

public class aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int aletorio = random.nextInt(100);
		System.out.println(aletorio);
		aletorio = random.nextInt(10,100);//[10,100)
		System.out.println((float)(Math.random()));
	}

}

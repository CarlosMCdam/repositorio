package bucles;

public class Ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,m,s;
		for (h=0,m=0,s=0;h<24;) {
			System.out.printf("%d:%02d:%02d\n", h,m,s);
			s++;
			if (s==60) {
				s=0;
				m++;
				if (m==60) {
					m=0;
					h++;
				}
			}
		}
	}

}

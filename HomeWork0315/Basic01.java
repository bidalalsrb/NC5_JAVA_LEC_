package HomeWork0315;

public class Basic01 {

	public static void main(String[] args) {
		int ten = 10;
		while (ten > 0) {
			System.out.print(" " + ten);
			ten--;
		}
		System.out.println("");
		int ten1 = 10;
		do {
			System.out.print(" " + ten1);
			ten1--;
		} while (ten1 > 0);
		System.out.println("");

		for (int ten2 = 10; 0 < ten2; ten2--) {
			System.out.print(" " + ten2);
		}

		System.out.println("");
		int i = 0;
		int sum = 0;
		while (i < 100) {
			i++;
			sum += i;

		}
		System.out.println(" " + sum);

		int ii = 0;
		int sum2 = 0;
		do {
			ii++;
			sum2 += ii;

		} while (ii < 100);
		System.out.println(" " + sum2);
		
		
		int sum3 =0;
		for(int j = 0;j<=100;j++)
		{
			sum3+=j;
		}
		System.out.println(" " + sum3);
	}

	
}

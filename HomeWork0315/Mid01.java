package HomeWork0315;

public class Mid01 {
	public static void main(String[] args) {
		int i = 0;
		while (i < 10) {
			i++;
			if (i % 2 == 0) {
				System.out.println("짝수" + i);

			}
		}
		int sum = 0;
		for (int ii = 0; ii <= 1000; ii++) {
			if (ii % 2 == 0 && ii % 7 == 0) {
				System.out.println(sum);
				sum += ii;
				
			}
		}
		
		for (int q = 2; q < 10; q++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(q + " * " + j + " = " + q * j);
			}
		}

	}

}

// 끝

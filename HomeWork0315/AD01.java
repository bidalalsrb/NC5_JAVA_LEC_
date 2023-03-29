package HomeWork0315;

public class AD01 {
	public static void main(String[] args) {
		int input = 78670;
		int val[] = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 1 };
		int[] data = new int[9];
		for (int i = 0; i < val.length; i++) {
			data[i] = input / val[i];
			input = input - val[i] * data[i];
			System.out.print(data[i]);

		}
		System.out.print("오만원권 : " + data[0] +" 만원권 : " + data[1]+ " 오천원권 : " + data[2] +" 천원권 : " + data[3]
				+" 오백원 : " + data[4]+ " 백원 : " + data[5]+ " 오십원 : " + data[6] +" 십원 : " + data[7] +" 일원 : " + data[8]);
	}

}

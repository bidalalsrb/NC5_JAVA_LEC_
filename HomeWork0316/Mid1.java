package HomeWork0316;

public class Mid1 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		for (int i = 0; i < 20; i++) {
			arr[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + "번 " + arr[i] + ", ");
		}
		System.out.println("\n");
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 1) {
				System.out.print(arr[i] + " 번째(홀)");
			} else {
				for (int j = 19; j >= 0; j--) {
					if (j % 2 == 0) {
						System.out.print(arr[j] + " 번째(짝)");
					}
				}
			}

		}

	}
//1 3 5 7 9 11 13 15 17 19   20 18 16 14 12 10 8 6 4 2 0
}

package HomeWork0316;

public class Basic {
	public static void main(String[] args) {

		int[] arr = new int[10];

		for (int i = 0; i < 10; i++) {
			arr[i] = (i + 1) * 3;
			System.out.print(arr[i]);

		}
		for (int j = arr.length - 1; j >= 0; j--) {
			System.out.print(arr[j]);
		}

	}

}

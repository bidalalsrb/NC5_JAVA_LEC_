package HomeWork0316.review;

public class basic1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		int num = 0;
		for(int i = 0; i <arr.length; i++) {
			num++;
			arr[i] = 3 * num;	
		}
		for(int j = 9; j >= 0; j--) {
			System.out.println(arr[j]);
		}
	}

}
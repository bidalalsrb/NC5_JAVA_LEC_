package HomeWork0316.review;

import java.util.Random;

public class basic3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3.int 배열로 10개의 공간을 생성하라
		// 1 ~ 10까지의 임의의 수를 저장하고 홀수만 골라서 출력하라

		Random random = new Random(); // 랜덤 객체 생성(난수 생성)
		int[] nums = new int[10];

		// 1부터 10까지의 임의의 수를 배열에 저장
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(10) + 1; // 1~10까지의 수 중 하나를 랜덤으로 선택, 컴퓨터는 0부터 세서 10을 넣으면 0~9로 설정.
		}

		// 홀수만 출력
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 1) { // 홀수인 경우에만 출력
				System.out.println(nums[i]);
			}
		}

	}

}
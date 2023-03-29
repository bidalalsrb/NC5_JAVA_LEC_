package HomeWork0316.review;

import java.util.Random;
import java.util.Scanner;

public class mid2 {
	// 게임 룰 : 컴퓨터가 3개의 랜덤값을 가지고
	// 사용자가 3개의 숫자를 입력 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데,
	// 숫자만 같으면 볼로 판정, 숫자와 위치까지 모두 같으면 스트라이크로 판정
	// 몇 스트라이크 몇 볼인지 출력
	// 3 스트라이크 시 몇회만에 맞췄는지 출력 후 게임종료
	// 다시 게임 진행할 지 물어보고 (1.리스타트, 0.종료)

	// 스트라이크와 볼의 개수를 세어줄 변수
	private int strike = 0;
	private int ball = 0;

	// 몇 번 게임했는지 세어줄 변수
	private int gameCnt = 0;

	// 컴퓨터 랜덤값 담아줄 배열
	int[] com = new int[3];

	// 사용자 입력값 저장할 배열
	int[] user = new int[3];

	Scanner sc = new Scanner(System.in);

	// 게임 스타트 메소드
	public void start() {
		System.out.println("야구 게임을 시작하시겠습니다.");
		while (true) { // 얘는 게임을 그만둘지 말지에 대한 와일문

			generateRandom();

			// 컴퓨터 배열 확인
			System.out.println(com[0] + ", " + com[1] + ", " + com[2]);

			while (true) { // 3스트라이크가 안됐을때 게임을 반복하게 하는 와일문
				getUserInput();

				// 사용자 입력값 확인
				System.out.println(user[0] + ", " + user[1] + ", " + user[2]);

				if (judgeStrike()) { // 3스트라이크 이면 true
					System.out.println("Strike : " + strike + " / ball : " + ball);
					break;
				} else { // 3스트라이크 아닐 때 false
					System.out.println("Strike : " + strike + " / ball : " + ball);
					gameCnt++;
					strike = 0;
					ball = 0;
					System.out.println("3 스트라이크여야 게임이 끝납니다. 다시 시도해주세요.");
					System.out.println("시도 횟수 : " + gameCnt);
					continue;
				}
			}

			if (reGame()) {
				strike = 0;
				ball = 0;
				gameCnt = 0;
				continue;
			} else {
				break;
			}

		}

	}

	// 컴퓨터 랜덤 값 3개 생성해주는 메소드
	public void generateRandom() {
		// 중복체크
		Random rand = new Random();

		com[0] = rand.nextInt(10);
		com[1] = rand.nextInt(10);
		while (true) {
			if (com[1] == com[0]) {
				com[1] = rand.nextInt(10);
			} else {
				break;
			}
		}
		com[2] = rand.nextInt(10);
		while (true) {
			if (com[2] == com[0] || com[2] == com[1]) {
				com[2] = rand.nextInt(10);
			} else
				break;
		}

	}

	// 중복값 체크 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;

		// 중복체크 로직

		return false;
	}

	// 유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		// 중복체크
		System.out.println("첫 번째 공을 입력해주세요.");
		int input1 = sc.nextInt();

		while (true) {
			if (input1 < 0 || input1 > 9) {
				System.out.println("0~9사이의 값을 다시 입력해주세요.");
				input1 = sc.nextInt();
			} else
				break;
		}

		System.out.println("두 번째 공을 입력해주세요.");
		int input2 = sc.nextInt();
		while (true) {
			if (input2 == input1) {
				System.out.println("중복된 값입니다. 다시 입력해주세요.");
				input2 = sc.nextInt();
			} else if (input2 < 0 || input2 > 9) {
				System.out.println("0~9사이의 값을 다시 입력해주세요.");
				input2 = sc.nextInt();
			}

			else {
				break;
			}
		}

		System.out.println("세 번째 공을 입력해주세요.");
		int input3 = sc.nextInt();

		while (true) {
			if (input3 == input1 || input3 == input2) {
				System.out.println("중복된 값입니다. 다시 입력해주세요.");
				input3 = sc.nextInt();
			} else if (input3 < 0 || input3 > 9) {
				System.out.println("0~9사이의 값을 다시 입력해주세요.");
				input3 = sc.nextInt();
			} else
				break;
		}
		user[0] = input1;
		user[1] = input2;
		user[2] = input3;
	}

	// 스트라이크 볼 판정하는 메소드
	public boolean judgeStrike() {
		for (int i = 0; i < com.length; i++) {
			if (com[i] == user[i]) {
				strike++;
			}
		}
		// 볼을 판단하는 것
		for (int i = 0; i < com.length; i++) {
			for (int j = 0; j < user.length; j++) {
				if (i != j) {
					if (com[i] == user[j]) {
						ball++;
					}
				}
			}
		}
		if (strike == 3) {
			return true;
		}
		return false;
	}

	// 재게임 여부
	public boolean reGame() {
		System.out.println(++gameCnt + "번만에 맞추셨습니다!");
		System.out.println("게임을 다시 하시겠습니까?");
		System.out.println("계속하기(1) 그만두기(0)");
		int input = sc.nextInt();

		if (input == 1) {
			return true;
		} else
			return false;
	}

}
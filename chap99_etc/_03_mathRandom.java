package chap99_etc;

public class _03_mathRandom {

	public static void main(String[] args) {

		// 1. 난수발생 첫번째 방식
		// Math.random() 사용
		System.out.println(Math.random());
		// 0 <= Math.random() < 1 사이의 난수

		// 2. 1 <= 난수 < 11
		// 0 <= Math.random()s <10
		// 1<= (int)Math.random() * 10+1 < 11
		int rand = (int) (Math.random() * 10) + 1;
		System.out.println(rand);

		// 3. 1~45까지 난수 발생기

		int radn2 = (int) (Math.random() * 45) + 1;
		System.out.println(radn2);

		// 4. 200 ~ 299 까지 난수 발생기
		int radn3 = (int) (Math.random() * 100)+200;
		System.out.println(radn3);
	}

}

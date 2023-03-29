package chap04_controlStatement;

public class _04_forStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1~100까지의 합
		//1~100까지 합을 담아줄 변수
		int sum = 0;
		int i;
		
		for(i = 1; i <= 100; i++) {
			//sum = sum + i;
			//sum = 0 + 1;
			//sum = 1 + 2;
			//sum = 3 + 3;
			//sum = 6 + 4;
			//...
			//sum = 4950 + 100;
			sum += i;
		}
		
		System.out.println("1~100까지의 합 : " 
							+ sum);
		System.out.println("for 문 종료시 i의 값: "
							+ i);
		
		
		
		
		
		
		
	}

}

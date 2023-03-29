package HomeWork0315;

import java.util.Scanner;

public class AA {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random() * 3);
	    
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2) : ");
		int num = sc.nextInt();
		
		System.out.println("나 : " + num);
		System.out.println("컴퓨터 : " + com);
		
		//2(보) - 2(보) = 0 비겼습니다
		//2(보) - 1(바위) = 1 졌습니다
		//2(보) - 0(가위) = 2 이겼습니다.
		
		//1(바위) - 2(보) = -1 이겼습니다
		//1(바위) - 1(바위) = 0 비겼습니다.
		//1(바위) - 0(가위) = 1 졌습니다.
		
		//0(가위) - 2(보) = -2 졌습니다.
		//0(가위) - 1(바위) = -1 이겼습니다.
		//0(가위) -0(가위) = 0 비겼습니다.
		
		switch(com-num) {
		   case  0:
		   System.out.println("비겼습니다.");
		   break; 
		   case 1: case -2:
		   System.out.println("졌습니다.");
		   break;
		   case 2: case -1:
		   System.out.println("이겼습니다.");
			   
		}
		 
		
		
	}



	}



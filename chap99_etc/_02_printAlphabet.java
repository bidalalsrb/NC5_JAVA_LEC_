package chap99_etc;

import java.io.IOException;

public class _02_printAlphabet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//1. 사용자 입력 값 받기
		//read(): int 타입의 값을 반환하고 입력 값을 문자로 인식
		//        리턴되는 int 타입의 값은 문자의 유니코드(10진수)
		System.out.print("영문자 하나를 입력하세요.: ");
		int inputUni = System.in.read();
		
		/*if(조건1) {
			조건1이 참(true)일 경우에만 동작
		} else if(조건2) {
			조건1은 거짓(false)이고 조건2가 참(true)인 경우 동작
		} else if(조건3) {
			
		} else {
			위의 모든 조건이 거짓(false)일 때 실행
		}*/
		//대문자 A 유니코드 65 알파벳의 개수 26개
		//소문자 a 유니코드 97 
		if(inputUni >= 65 && inputUni <= 90) {
			System.out.println("대문자입니다.");
			System.out.println((char)inputUni);
			
			
			//1. 입력된 문자가 대문자면 입력된 문자부터 
			//   대문자 Z까지 출력
			for(int i = inputUni; i <= 90; i++) {
				System.out.print((char)i);
			}
			System.out.println();
			
			//2. 대문자 A부터 입력된 문자까지 출력
			for(int i = 65; i <= inputUni; i++) {
				System.out.print((char)i);
			}
		} else if(inputUni >= 97 && inputUni <= 122) {
			System.out.println("소문자입니다.");
			System.out.println((char)inputUni);
			
			//1.입력된 문자가 소문자면 입력된 문자부터 
			//  소문자 z까지 출력
			for(int i = inputUni; i <= 122; i++) {
				System.out.print((char)i);
			}
			System.out.println();
			
			//2. 소문자 a부터 입력된 문자까지 출력
			for(int i = 97; i <= inputUni; i++) {
				System.out.print((char)i);
			}
		} else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}

}

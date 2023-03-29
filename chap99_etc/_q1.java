package chap99_etc;

import java.util.Scanner;

class Student {

	private String grade;
	private int number;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
}

public class _q1 {

	public static void main(String[] args) {
		// 필드를 모두 private로 하고, getter와 setter를 구현하고

//· Student 클래스의 main() 메소드에서 Student 객체를 생성하여
//setter를 사용하여 학과와 학번 필드에 적당한 값을 입력 후 출력
		Scanner scn = new Scanner(System.in);
		Student student = new Student();
		System.out.println("학과를 입력하시오 : ");
		String grade = scn.next();
		System.out.println("학번를 입력하시오 : ");
		int number = Integer.parseInt(scn.next());

		System.out.println(" 학과는 : " + grade);
		System.out.println(" 학번은 : " + number);

	}

}

package chap99_etc;

public class _02_age20 {
// i ? a: b;
	public static void main(String[] args) {
		int age = 29;
		 String result = (age >= 30) ? "20대가 아닙니다": (age == 29) ? "20대 입니다" :"" ;  
		 System.out.println(result);
	}

}

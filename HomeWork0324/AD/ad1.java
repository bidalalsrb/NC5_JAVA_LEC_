package HomeWork0324.AD;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class ad1 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // 2. 사용자가 입력한 문자열에서 중복된 문자를 제거한 문자열을 출력하세요.

        // 사용자 입력
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력: ");
        String input = sc.nextLine();

        // 중복된 문자 제거
        // 클래스 불러오기
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        // i는 입력받은 문자열 길이까지 str문자열을 반환할 문자열인 set에 추가
        for (int i = 0; i < input.length(); i++) {

            set.add(input.charAt(i));
        }

        // sb객체 생성
        StringBuilder sb = new StringBuilder();

        // 중복이 제거된 문자열을 추출하는 역할
        // 객체 sb에 하나씩 추가
        // Stringbuilder 내부 메소드, 해당 자리 끝에 문자열을 추가하는 클래스
        for (Character c : set) {
            sb.append(c);

        }

        // 문자열 반환

        System.out.println(sb.toString());
    }
}

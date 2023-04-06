package HomeWork0405;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//4. 사용자가 입력한 영문자 10개를 저장하는 List<Character> charList를 만들고 스트림을 이용해서
//    영문자가 소문자면 대문자로 대문자면 소문자로 바꾼 스트림을 만들어서 출력하세요.
public class no4 {
    public static void main(String[] args) {
        List<Character> charList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            charList.add(str.charAt(i));
//            System.out.println(charList.get(i));
        }

        charList.stream().forEach(cl -> {
//            System.out.println(cl.charValue());
            if (cl >= 'a' && cl <= 'z') {
                System.out.println(cl.toString().toUpperCase());
            } else if (cl >= 'A' && cl <= 'Z') {
                System.out.println(cl.toString().toLowerCase());
            }
        });
    }
}

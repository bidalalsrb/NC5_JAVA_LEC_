package HomeWork0406;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//1. 사용자가 입력한 문자열 10개를 저장한 문자열 리스트를 이용하여
// 문자열의 길이가 5이상인 문자열만 출력하세요.
public class no1 {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            strList.add(sc.nextLine());
        }
        Stream<String> strStream = strList.stream();
        strStream.filter(num -> num.length() >= 5).forEach(num -> System.out.println(num));

    }
}

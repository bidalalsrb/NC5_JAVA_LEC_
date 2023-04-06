package chap20_lambda;

import chap20_lambda.clazz.ExCustomString;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExMain {
    public static void main(String[] args) {
        List<ExCustomString> customList = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 문자열을 입력하세요 : ");
            customList.add(new ExCustomString(sc.next()));
        }

        System.out.print("찾을 문자를 입력하세요 : ");
        char findch = sc.next().charAt(0);

        for (int i = 0; i < 3; i++) {
            int num = i;
            customList.get(i).changeStr(findch, (ch, str) -> {
                ch = findch;
                str = String.valueOf(customList.get(num).getStr());
                if (str.contains(String.valueOf(ch))) {
                    return str;
                } else
                    return "";
            });
        }
        System.out.println(customList.toString());
    }


//        System.out.println(str);
//        System.out.println(findCh);


}


package HomeWork0327;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

//정수형 데이터를 저장할 수 있는 LinkedList를 생성하고 사용자가 입력한 5개의 정수를 저장하고
//    index가 3, 4번 요소를 값은 100, 200으로 변경하고 출력하세요.
public class basic02 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(sc.nextInt());
            System.out.println(list.get(i));
        }
        list.set(3,100);
        list.set(4,200);
        System.out.println(list);
        sc.close();

    }
}

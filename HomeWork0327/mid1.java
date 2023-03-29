package HomeWork0327;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// 학생이름을 key로 시험점수를 value로 가지는
// Map<String, Integer>를 생성하고
//     4명의 학생 데이터를 입력한 후 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
public class mid1 {
    public static void main(String[] args) {
        int max = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            map.put(sc.nextLine(), sc.nextInt());
            sc.nextLine();
        }
        System.out.println(map);
        Integer maxValue = Collections.max(map.values());
        System.out.println(maxValue);

        System.out.println(map.keySet());
    }
}


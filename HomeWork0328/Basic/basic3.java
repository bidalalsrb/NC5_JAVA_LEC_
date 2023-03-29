package HomeWork0328.Basic;

import java.util.Arrays;
import java.util.List;

//public static Integer add(List<?> list) 와일드 카드를 이용한 메소드를 구현하세요.
public class basic3 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<Double> doubleList = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);
        System.out.println(add(intList));
    }

    public static Integer add(List<?> list) {
        int tot = 0;
        for (Object sum : list) {
            tot = tot + (Integer) sum;
        }

        return tot;
    }
}

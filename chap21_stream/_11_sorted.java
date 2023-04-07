package chap21_stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class _11_sorted {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <= 5 ; i++) {
                intList.add((int) (Math.random()*10)+1);
        }
        //.sorted()
        //Comparator.reverseOrder() : 역순(내림차순)으로 정렬
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}

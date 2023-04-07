package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _12_Peak {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 1; i < 10; i++) {
            intList.add(i);
        }

        // 1. peek 최종 처리 없이 잘못 작성
        //    최종 처리가 없어서 peak이 동작하지 않음
        intList.stream().filter(num -> num % 3 == 0).peek(System.out::println);
        // 2. peek 최종 처리가 있을 때
        intList.stream().filter(num -> num % 3 == 0).peek(System.out::println).mapToInt(num -> num).sum();
        // 3. peek은 stream을 리턴
        Stream<Integer> newIntStream = intList.stream().peek(num -> Stream.of(num));

        newIntStream.forEach(System.out::println);


    }
}

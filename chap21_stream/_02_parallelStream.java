package chap21_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class _02_parallelStream {
   static int sum = 0;

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        // 병렬처리 스트림 얻기
        // 병렬처리 스트림은 스레드 풀을 생성해서
        // 여러개 스레드를 사용해서 작업을 병렬처리할 수 있도록 한다.

        Stream<Integer> intStream = intList.parallelStream();

        intStream.forEach(num->{
            System.out.println(num + " : " + Thread.currentThread().getName());
        });





    }
}

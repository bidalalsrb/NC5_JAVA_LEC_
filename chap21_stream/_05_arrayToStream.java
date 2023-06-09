package chap21_stream;

import java.util.Arrays;

public class _05_arrayToStream {
    public static void main(String[] args) {
        int[] intArr = new int[10];

        for (int i = 0; i < 10; i++) {
            intArr[i] = (int) (Math.random() * 10 + 1);
        }
//
//        IntStream intStream = Arrays.stream(intArr);
//
//        // 5이상인 값들만 스트림으로 만들고
//        IntStream intStream1 = intStream.filter(a -> a >= 5);
//
//        IntStream intStream2 = intStream1.map(a -> a * 4);
//        intStream2.forEach(a -> System.out.println(a));

        Arrays.stream(intArr).filter(a -> a >= 5).map(a -> a * 4).forEach(a -> System.out.println(a));


    }
}

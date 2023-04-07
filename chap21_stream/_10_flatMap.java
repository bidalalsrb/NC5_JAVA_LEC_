package chap21_stream;

import java.util.Arrays;

public class _10_flatMap {
    public static void main(String[] args) {
        //{1,2},{3,4},{5,6}
        // Stream<int[]>
        // Stream<Stream> .flatMap => Stream<Integer>

        int[][] intArr = {{1, 2}, {3, 4}, {5, 6}};

        Arrays.stream(intArr).flatMapToInt(Arrays::stream).forEach(num -> System.out.println(num));

    }
}

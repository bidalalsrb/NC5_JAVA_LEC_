package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _05_linkedList {
    public static void main(String[] args) {
        // ArrayList와 LinkedList 속도 비교
        List<String> aList = new ArrayList<String>();
        List<String> lList = new LinkedList<String>();

        long startTime;
        long endTime;
//순차적 데이터 넣기
        startTime = System.nanoTime();
        for (int i = 0; i < 100000000; i++) {
            aList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList에 순차적으로 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");

//contains 메소드 속도 비교
        System.out.println(aList.contains("900000"));

        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            lList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList에 순차적으로 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        //contains 메소드 속도 비교
        System.out.println(lList.contains("900000"));
        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            aList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList에 순차적으로 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");

//get
        System.out.println(aList.get(80000));

        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            lList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList에 순차적으로 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        //contains 메소드 속도 비교
        System.out.println(lList.contains("900000"));
        System.out.println("----------------------------");

        System.out.println(lList.get(80000));

        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 0; i < 1000000000; i++) {
            lList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList에 순차적으로 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");



        //List 중간에 값 추가 속도 비교

        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            aList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList에 중간에 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            lList.add(String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("Linkedlist 중간에 데이터를 " + "추가하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");



        //remove(int index) 인덱스로 데이터 삭제하는 속도 비교
        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            aList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList에 인덱스의 데이터를 " + "삭제하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");

        startTime = System.nanoTime();
        for (int i = 1000; i < 5000; i++) {
            lList.remove(i);
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList에 인덱스의 데이터를 " + "삭제하는 데 걸린시간 : "
                + (endTime - startTime) + "나노 초입니다.");
        System.out.println("----------------------------");

         }
}

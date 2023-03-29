package chap17_generic;

import java.util.ArrayList;
import java.util.List;

public class _04_genericEx01 {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            intList.add(i + 1);
        }
        System.out.println(getEven(intList));
        System.out.println(_04_genericEx01.getEven(intList));
    }
    // list가 짝수면 리턴


    public static <T extends Number> List<T> getEven(List<T> list) {
        List<T> returnList = new ArrayList<T>();

        for (T t : list) {
            if (t.intValue() % 2 == 0) {
                returnList.add(t);
            }
        }
        return returnList;

    }


}

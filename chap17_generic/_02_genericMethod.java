package chap17_generic;

public class _02_genericMethod {
    public static void main(String[] args) {
        String[] strArr = {"java", "JavaScript", "Html"};
        Integer[] intArr = {1, 2, 3, 4, 5};

        String result1 = getLastEle(strArr);
        int result2 = getLastEle(intArr);

        System.out.println("strArr의 마지막 요소는 " +  getLastEle(strArr));
        System.out.println("strArr의 마지막 요소는 " +  getLastEle(intArr));

    }

    public static <T> T getLastEle(T[] tArr) {
        return tArr[tArr.length - 1];
    }

}

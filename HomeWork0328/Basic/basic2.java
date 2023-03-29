package HomeWork0328.Basic;
//public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고
// 매개변수로 어떤 값이 들어오던 문자열
//결합연산이 돼서
// 스트링값으로 리턴하도록 만드세요.


public class basic2 {
    public static void main(String[] args) {
        String a = add(123, 123);
        System.out.println(a);
    }

    public static <T> String add(T t1, T t2) {

        return t1.toString() + t2.toString();
    }
}

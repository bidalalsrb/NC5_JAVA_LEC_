package chap14_execption;

public class _01_tryCatchFinally {
    public static void main(String[] args) throws NullPointerException {
        int[] arr = {1, 2, 3};
        String[] strArr = new String[3];
        int index = 0;

        while (true) {
            try {
                System.out.println(arr[index++]);
//                if (index ==2){
//                    System.out.println(10/2);
//                }
                strArr[0].length();
            } catch (NullPointerException ne) {
                System.out.println(ne.getMessage());
                System.out.println("널값이라 속성이나 메소드를 사용할 수 없습니다");


            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(index + "는 배열에 존재하지 않는 인덱스입니다.");
            } finally {
                {
                    if (index < 3) {
                        System.out.println("정상출력");
                    } else {
                        System.out.println("예외 발생. while문을 종료합니다");
                        break;
                    }
                }
            }
        }
    }
}

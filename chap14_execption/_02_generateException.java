package chap14_execption;

public class _02_generateException {
    public static void main(String[] args) {
        try {
//            NullPointerException ne = new NullPointerException("널ㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹㄹ");
//            //1. NullPointerException
//            //2. ArithmeticException
//            throw ne ;
            ArithmeticException ae = new ArithmeticException("분모가 0일 수 없어");
            throw ae;
        } catch (NullPointerException ne) {
            System.out.println(ne.getMessage());
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
            // 마지막 catch문은 위에 선언한 catch문을
            // 다 통과한 예외들을 처리할 수 있게
            // 모든 예외를 담을 수 있는 예외의 최상위 클래스
            // Exception으로 예외를 처리해준다.
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

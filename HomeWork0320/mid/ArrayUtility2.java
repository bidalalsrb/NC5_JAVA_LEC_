package HomeWork0320.mid;

//2. 다음 두 개의 static 가진 ArrayUtility2클래스를 만들어보고 사용하세요
//  static int[] concat(int[] s1, int[] s2);	// s1과 s2를 연결한 새로운 배열 리턴
//  static int[] remove(int[] s1, int[] s2);	// s1에서 s2배열의 숫자를 모두 삭제한 새로운 배열 리턴
public class ArrayUtility2 {
    static int[] concat(int[] s1, int[] s2) {
        int sumLength = s1.length + s2.length;
        int result[] = new int[sumLength];

        for (int i = 0; i < sumLength; i++) {
            if (i < s1.length)
                result[i] = s1[i];
            else
                result[i] = s2[i - s1.length];
        }
        return result;
    }

    // s1에서 s2 배열의 숫자를 모두 삭제한 새로운 배열 리턴
    static int[] remove(int[] s1, int[] s2) {
        int cnt = 0;
        int result[] = new int[s1.length - s2.length];
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    break;
                } else if (j == s2.length - 1) {
                    result[cnt] = s1[i];
                    cnt++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int num1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int num2[] = {3, 5, 7, 9};

        int result[] = new int[num1.length + num2.length];

        // num1 출력
        System.out.print("1 >> ");
        for (int i = 0; i < num1.length; i++)
            System.out.print(num1[i] + " ");
        System.out.println();

        // num2 출력
        System.out.print("2 >> ");
        for (int i = 0; i < num2.length; i++)
            System.out.print(num2[i] + " ");
        System.out.println();

        // num1, num2를 연결
        System.out.println("concat >> ");
        result = remove(num1, num2);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();

        // num1 에서 num2 배열의 숫자를 모두 삭제
        System.out.println("remove >> ");
        result = remove(num1, num2);
        for (int i = 0; i < result.length; i++)
            System.out.print(result[i] + " ");
        System.out.println();
    }


}

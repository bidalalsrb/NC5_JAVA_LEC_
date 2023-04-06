package HomeWork0330;

import java.util.Scanner;

public class study05_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1부터 10까지의 정수의 합을 출력하세요.
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//        }
//        System.out.println(sum);

        //2.2의 거듭제곱을 10회동안 반복하며 출력하세요.
        // (2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
        // 2*2 = 4 / 2*2*2 = 8 / 2*2*2*2 = 16 / 2*2*2*2*2 = 32
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("2");
//            for (int j = 1; j <3; j++) {
//                System.out.print("*2");
//            }
//        }
        //3.사용자가 입력한 정수까지의 모든 소수를 출력하세요.
        //4.사용자가 입력한 정수의 약수를  출력하세요.
        //5.사용자가 입력한 10개의 정수를 역순으로 출력하세요.(배열 사용)
//        int[] input = new int[10];
//        for (int i = 0; i <= 9; i++) {
//            input[i] = sc.nextInt();
//        }
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(input[i]);
//        }
        //6. 사용자가 입력한 문자열을 역순으로 출력하세요.
//        String[] input = new String[10];
//        for (int i = 0; i <= 9; i++) {
//            input[i] = sc.nextLine();
//        }
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(input[i]);
//        }
//        7. 사용자가 입력한 두 정수의 최소공배수와 최대공약수를 출력하세요.

        int a = sc.nextInt(); // 2
        int b = sc.nextInt(); // 4

        int minm = 0;
        int maxm = 0;
        for (int i = 1; i <= a && i <= b; ++i) {
            if (a % 2 == 0 && b % 2 ==0){
                minm = i;
            }

        }
        System.out.println(minm);

        //8.중첩 for문으로 이용해서 다음과 같이 출력하세요.
        //
        //8-1. *
        //     **
        //     ***
        //     ****
        //     *****
        //
        //8-2. *****
        //      ****
        //       ***
        //        **
        //         *
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//        }
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 5; j > i; j--) {
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
        //9. 사용자가 q를 입력하기 전까지 계속 반복하면서 입력한 정수의 값을 더해서 출력하세요.
//        int sum = 0;
//        while (true) {
//            int input = sc.nextInt();
//            sum += input;
//            System.out.println(sum);
//            if (Character.toChars(input).equals()) {
//                System.out.println("q");
//            }
//
//        }

    }
}

package HomeWork0330;

import java.util.Scanner;

public class study01_Val {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. 사용자가 입력한 이름, 나이, 성별을 출력하세요.
//        String name = sc.nextLine() ;
//        int age = sc.nextInt();
//        String gen =sc.next();
//        sc.nextLine();
//        System.out.println(name+age+gen);
        // 2. 사용자가 입력한 두 개의 정수와 문자(char) 연산자를 받아
        // 두 정수로 해당 연산을 진행한 결과를 출력하세요.
//        int num1 = sc.nextInt() ;
//        int num2 = sc.nextInt();
        char ch = sc.next().charAt(0);
//        switch (ch) {
//            case '+':
//                System.out.println( num1 + "+" + num2 + "=" +(num1 + num2) );
//                break;
//            case '-':
//                System.out.println( num1 + "-" + num2 + "=" +(num1 - num2) );
//                break;
//            case '*':
//                System.out.println( num1 + "*" + num2 + "=" +(num1 * num2) );
//                break;
//            case '/':
//                System.out.println( num1 + "/" + num2 + "=" +(num1 / num2) );
//                break;
//        }
        // 3. 반지름이 20인 원의 넓이와 둘레를 출력하세요.(넓이 : 2 * 3.14 * 반지름 ^ 2, 둘레 : 4 * 3.14 * 반지름)
        //    단, 원주율 3.14는 상수로 선언하세요.

//        int radius = 20;
//        float pi = 3.14f;
//
//        System.out.println("넓이 = " + 2 * pi * radius * radius);
//        System.out.println("둘레 = " + 4 * pi * radius);
        // 4. 사용자가 입력한 5개의 정수의 합계와 평균을 출력하세요.
//        int[] num = new int[5];
//        int sum = 0;
//        float avg = 0;
//        for (int i = 0; i < num.length; i++) {
//            num[i] = sc.nextInt();
//            sum += num[i];
//            avg = sum / num.length;
//        }
//        System.out.println("합계 = " + sum);
//        System.out.println("평균 = " + avg);
        // 5.사용자가 입력한 세 정수의
        // 최소 값, 중간 값, 최대 값을 출력하세요.
//        int num1 = sc.nextInt(); // 1
//        int num2 = sc.nextInt(); // 2
//        int num3 = sc.nextInt(); // 3
//        int cen = num1;
//        if (cen < num2) {
//            if (num2 < num3) {
//                cen = num2;
//            }
//        }
//        int min = num1;
//        if (min > num2) {
//            min = num2;
//        }
//        if (min > num3) {
//            min = num3;
//        }
//        int max = num1;
//        if (max < num2) {
//            max = num2;
//        }
//        if (max < num3) {
//            max = num3;
//        }
//
//        System.out.println("최대 값 : " + max);
//        System.out.println("중간 값 : " + cen);
//        System.out.println("최소 값 : " + min);
        //6. 사용자가 입력한 정수의 구구단을 출력하세요
//        int input = sc.nextInt();
//        for (int i = input; i <=input; i++) {
//            for (int j = 1; j <9; j++) {
//                System.out.println(i+"*"+j+"="+i*j);
//            }
//        }
        //7.사용자가 입력한 정수로 해당 정수의 팩토리얼을 계산하여 출력하세요.
        // (재귀메소드 없이, while이나 for 반복문을 사용)

        //3! = 3*2*1 = 6
        //4! = 4*3*2*1 = 24
        //5! = 5*4*3*2*1 = 120
//        int input = sc.nextInt();
//        int sum = 1;
//        for (int i = input; i >= 1; i--) {
//            sum *= i;
//        }
//        System.out.println(sum);


        //8. 사용자가 입력한 10개의 정수 중 소수의 개수를 출력하세요.
        // (소수는 1이랑 본인 말고는 나눠떨어지는 값이 없는 수입니다.)
        //   사용자가 입력할 수 있는 값은 2 ~ 30로 제한

        int[] input = {2,3,4,5,6,7,8,9,10,11}; // 2,3,5,7,11
        while (true){


            if (3 / 1 == 3 && 3 % 1 ==3){
                System.out.println("소수d");
            }
            else {
                System.out.println("다시해");
            }
            System.exit(0);
        }

    }

}

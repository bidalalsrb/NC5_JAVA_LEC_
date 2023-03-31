package HomeWork0330;

import java.util.Scanner;

public class study03_Oper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 사용자가 입력한 두 정수읜 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
        //  (메소드로 따로 만들지 말고 메인메소드에서 구현)
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        System.out.println("덧셈 : " + input1 + "+" + input2 + " = " + (input1 + input2));
        System.out.println("뻴셈 : " + input1 + "-" + input2 + " = " + (input1 - input2));
        System.out.println("곱셈 : " + input1 + "*" + input2 + " = " + (input1 * input2));
        System.out.println("나머지 : " + input1 + "/" + input2 + " = " + (input1 % input2));
        //2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
        // 21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
//
//        int val = 20;
//        System.out.println(++val); // 21
//        System.out.println(++val); // 22
//        System.out.println(val); // 22
//        System.out.println(val--); // 22
//        System.out.println(--val); // 20
//        System.out.println(val--); // 20
//        System.out.println(val++);
//        System.out.println("------------------------");
//        System.out.println("마지막 변수 값 " + val);
        //3. 사용자가 입력한 정수가 2와 7의 공배수면 "2와 7의 공배수"라고 출력하고 아니면
        // "2와 7의 공배수가 아님"이라고 출력하세요.
//        int input = sc.nextInt();
//        if (input % 2 == 0 && input % 7 == 0){
//            System.out.println("2와 7의 공배수야 연진아");
//        }else {
//            System.out.println("2와 7의 공배수 아니야 연진아");
//        }

        //4.사용자로부터 입력받은 문자열이 "Hello"인지 아닌지 판별하는 프로그램을 작성하세요.

//        String input = sc.nextLine();
//        if (input.equals("Hello")){
//            System.out.println("맞아 연진아");
//        }
//        else {
//            System.out.println("아지야 연진아");
//        }
        //5.삼항연산자를 이용하여 사용자가 입력한 정수가 홀수면 "홀수" 짝수면 "짝수"라고 출력하세요.

//        int input = sc.nextInt();
//        String result = "";
//        result = ((input % 2) == 0) ? "짝이야 연진아" : "홀이야 연진아";
//        System.out.println(result);
        //6.삼항연산자의 중첩을 이용하여 사용자가 입력한 정수가
        // 100보다 크면 "100보다 큼" 작으면 "100보다 작음" 같으면 "100"을 출력하세요.

//        int input = sc.nextInt();
//        String result = input == 100 ? "100" :input >100 ? "100보다 큼":"100보다 작아";
//        System.out.println(result);

        //7.사용자가 입력한 두 실수의 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 연산의 결과를 출력하세요.
//            float input1 = sc.nextFloat();
//            float input2 = sc.nextFloat();
//
//        System.out.println(input1 + "+" + input2 +"=" +(input1+input2));
//        System.out.println(input1 + "-" + input2 +"=" +(input1-input2));
//        System.out.println(input1 + "*" + input2 +"=" +(input1*input2));
//        System.out.println(input1 + "/" + input2 +"=" +(input1/input2));
        //8.사용자가 입력한 하나의 문자열과 하나의 정수로
        // "입력한 문자열 xxxxx이고, 입력한 숫자는 xxxxxx입니다." 라고 출력하세요.
//        String strInnput = sc.nextLine();
//        int intInnput = sc.nextInt();
//
//        System.out.println("입력한 문자열은 " + strInnput + "이고, " + "입력한 숫자는 " + intInnput + "입니다."+"합치면 " + (strInnput+intInnput));

    }


}

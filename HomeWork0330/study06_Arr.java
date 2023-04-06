package HomeWork0330;

import javax.swing.*;
import java.util.Scanner;

public class study06_Arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1. 1부터 10까지의 정수를 배열에 저장하고
        // 배열의 모든 요소를 출력하세요.
//        int[] input = new int[10];
//
//        for (int i = 0; i < input.length; i++) {
//            input[i] = sc.nextInt();
//        }
//        for (int i = 0; i < input.length; i++) {
//            System.out.println(input[i]);
//        }
        //2. 사용자가 q를 입력하기 전까지 정수를 입력받아
        // 배열에 저장하고 배열의 모든 요소를 출력하세요.

//        int index=0;
//        int[] input = new int[100];
//        while (true){
//            String strinput = sc.next();
//            if(strinput.equals("q")){
//                for (int i = 0; i < input.length; i++) {
//                    if(input[i] != 0)
//                        System.out.print(input[i]);
//                }
//                break;
//            }
//            input[index] = Integer.parseInt(strinput);
//            index++;
//        }
        //3. 사용자가 입력한 10개의 정수를 배열에 저장하고
        // 평균을 계산하여 출력하세요.
//        int[] input = new int[10];
//        int sum = 0;
//        float avg =0;
//        for (int i = 0; i < input.length; i++) {
//            input[i] = sc.nextInt();
//            sum += input[i];
//            avg= sum/ input.length;
//        }
//        System.out.println(sum);
//        System.out.println(avg);
        //4. 1부터 100까지의 숫자 중에서 짝수만 배열에 저장하고
        // 배열의 합을 계산하여 출력하세요.
//        int[] arr = new int[100];
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            arr[i-1] = i;
//            if (arr[i-1] % 2 == 0) {
//                sum += arr[i-1];
//            }
//        }
//        System.out.println(sum);
        //5.사용자가 입력한 10개의 정수를 배열에 저장하고
        // 최소값과 최대값을 찾아서 출력하세요.
//        int[] arr = new int[10];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (max < arr[i]) {
//                max = arr[i];
//            }
//            if (min > arr[i]) {
//                min = arr[i];
//            }
//        }
//        System.out.println(max);
//        System.out.println(min);

        //6. 용자가 입력한 5개의 문자열을 배열에 저장하고 길이가 가장 긴 문자열과
        // 길이가 가장 작은 문자열을 출력하세요.
//        String[] strArr = new String[5];
//        for (int i = 0; i < strArr.length; i++) {
//            System.out.println("입력해 연진아 " + i + "번");
//            strArr[i] = sc.nextLine();
//        }
//        String minArr = strArr[0];
//        String maxArr = strArr[0];
//        for (int i = 0; i < strArr.length; i++) {
//            if (strArr[i].length() < minArr.length()) {
//                minArr = strArr[i];
//            }
//            if (strArr[i].length() > maxArr.length()) {
//                maxArr = strArr[i];
//            }
//        }
//        System.out.println("작은 문자열은 " + minArr);
//        System.out.println("큰 문자열은 " + maxArr);
        //7.두 개의 정수형 배열을 만들고 1 ~ 100까지의 랜덤한 값으로
        // 첫 번째 배열은 4개 두 번째 배열은 3개를 저장하고 두 배열을 합친 새로운 배열을 생성하세요.
//        int[] intArr = new int[4];
//        int[] intArr2 = new int[3];
//        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = (int) (Math.random() * 100) + 1;
//            System.out.println(intArr[i]);
//        }
//        for (int i = 0; i < intArr2.length; i++) {
//            intArr2[i] = (int) (Math.random() * 100) + 1;
//            System.out.println(intArr2[i]);
//        }
//        System.out.println("--------------");
//        int[] intArr3 =new int[intArr.length+intArr2.length];
//        intArr3 = intArr;
//        for (int i = intArr.length; i < intArr3.length; i++) {
//            intArr3[i] = intArr2[i-intArr.length];
//        }
////
////        for (int i = 0; i < intArr.length; i++) {
////            intArr3[i] = intArr[i];
////        }
////        for (int i = intArr2.length; i < intArr3.length-intArr.length; i++) {
////            intArr3[i] = intArr2[i-intArr2.length];
////        }
//        System.out.println("------------------");
//        for (int i = 0; i < intArr3.length; i++) {
//            System.out.println(intArr3[i]);
//        }
        //8. 사용자가 문자열을 입력하는데 문자열 사이사이에 -을 넣어 구분자로 만들어준다.
        // -기준으로 잘라진 문자열 배열을 생성하고
        // 잘라진 문자열 중에 가장 길이가 긴 문자열의 인덱스와 그 문자열을
        // 출력하세요.
        String strinput1 = sc.next();
        System.out.println(strinput1);

    }
}

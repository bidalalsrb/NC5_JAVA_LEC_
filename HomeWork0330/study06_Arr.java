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
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}

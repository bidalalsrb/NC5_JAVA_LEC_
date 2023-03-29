package chap99_etc.game;

import java.util.Scanner;

public class ditto {
    Scanner sc = new Scanner(System.in);
    int[] input = new int[6];
    int[] randomNum = new int[6];
    int bonus;
    int cnt = 0;

    public void input() {

        System.out.println("6개 숫자를 입력하시오");
        for (int i = 0; i < input.length; i++) { // 입력
            input[i] = sc.nextInt();
            for (int q = 0; q < i; q++) {
                if (input[i] == input[q]) {
                    q--;
                }
            }
            System.out.println(input[i] + "숫자 ");
        }
        System.out.println("----------------------------");

    }

    public void random() {
        bonus = (int) (Math.random() * 45) + 1;
        for (int i = 0; i < randomNum.length; i++) { // 랜덤
            randomNum[i] = (int) (Math.random() * 45) + 1;

            for (int q = 0; q < i; q++) {
                if (randomNum[i] == randomNum[q]) {
                    i--;
                }
            }
            System.out.print(i + " 번 " + randomNum[i] + " // ");
        }
        System.out.print(bonus + " 보너스");
    }

    // 1등 : 보너스를 제외한 6개의 숫자가 모두 같을때
    public void one() {
        for (int i = 0; i < input.length; i++) {
            for (int q = 0; q < i; q++) {
                if (input[i] == randomNum[i]) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt + "번 맞췄습니다");
    }

    public void two() {
        switch (cnt) {
            case 6:
                System.out.println("1등");
                break;
            case 5:
                System.out.println("2등");
                break;
            case 4:
                System.out.println("3등");
                break;
            case 3:
                System.out.println("4등");
                break;
            default:
                System.out.println("꽝");
                break;
            // 1등 : 보너스를 제외한 6개의 숫자가 모두 같을때
            // 2등 : 보너스 번호와 5개의 번호가 일치할때
            // 3등 : 보너스를 제외한 5개의 숫자가 같을때
            // 4등 : 보너스를 제외한 4개의 숫자가 같
            // 5등 : 보너스를 제외한 3개의 숫자가 같
            // else ~ 꽝
            // 몇등인지 출력
        }
    }
}



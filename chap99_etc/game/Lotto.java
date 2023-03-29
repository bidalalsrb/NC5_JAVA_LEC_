package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {



    public static void main(String[] args) {
        ditto game = new ditto();
        // 1 ~ 45까지 7개의 난수 (중복 제거)
         game.random();
        // 7번째 숫자는 보너스 번호 ??
        // 사용자가 1~45까지 6개 숫자 선택 (중복 제거)
//         game.input();
//         game.one();

        // 1등 : 보너스를 제외한 6개의 숫자가 모두 같을때
        // 2등 : 보너스 번호와 5개의 번호가 일치할때
        // 3등 : 보너스를 제외한 5개의 숫자가 같을때
        // 4등 : 보너스를 제외한 4개의 숫자가 같
        // 5등 : 보너스를 제외한 3개의 숫자가 같
        // else ~ 꽝
        // 몇등인지 출력



    }



}

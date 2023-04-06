package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;

public class _04_pipeLineEx {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<CreditCard>();
        /*
        카카오, 라이언, 1000
        삼성카드, 탭탭, 2000
        신한, 드림, 3000
        삼성카드,ID, 5000
        현대카드, 더블랙, 100000
        아메스, 블랙카드, 300000
         한도 오천 이상 카드 회사와 카드 이름 출력
         */

        cardList.add(new CreditCard("카카오", "라이언", 1000));
        cardList.add(new CreditCard("삼성카드", "탭탭", 2000));
        cardList.add(new CreditCard("신한", "드림", 3000));
        cardList.add(new CreditCard("삼성", "ID", 5000));
        cardList.add(new CreditCard("현대", "더블랙", 10000));
        cardList.add(new CreditCard("아메스", "블랙", 30000));


        cardList.stream().filter(card -> card.getLimitMoney() >= 5000).forEach(card -> {
            System.out.println(card.getCompany() + " : " + card.getCardName());
        });

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i <= 30; i++) {
            intList.add(i);
        }
        int sum = intList.stream().reduce((result, num) -> result + num)
                .get();
        System.out.println(sum);
    }
}

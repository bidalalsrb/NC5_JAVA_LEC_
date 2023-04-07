package chap21_stream;

import chap21_stream.clazz.CreditCard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class _16_groupingBy {
    public static void main(String[] args) {
        List<CreditCard> cardList = new ArrayList<>();

        cardList.add(new CreditCard("a", "A", 100));
        cardList.add(new CreditCard("a", "B", 300));
        cardList.add(new CreditCard("a", "C", 600));
        cardList.add(new CreditCard("b", "D", 500));
        cardList.add(new CreditCard("b", "E", 800));
        cardList.add(new CreditCard("c", "F", 200));
        cardList.add(new CreditCard("c", "G", 500));

        //1. 특정 카드사의 카드만 뽑아서 collect로 수집 후 리스트로 변환
        // 1. groupingBy 메소드로 Map<company, List<CreditCard>>로 매핑
        Map<String, List<CreditCard>> companyCardMap = cardList.stream()
                .collect(Collectors.groupingBy(card -> card.getCompany()));
        System.out.println(companyCardMap.toString());

        //2. Map<cardName, limitMoney>
        Map<String, Integer> cardMap = cardList.stream().filter(card -> card.getLimitMoney() >= 500).collect(Collectors.toMap(card -> card.getCardName(), card -> card.getLimitMoney()));
        System.out.println(cardMap.toString());


        //2. groupingBy 메소드로
        Map<String, Double> avgLimMoneyMap = cardList.stream()
                .collect(Collectors.groupingBy(   /*키를 구하는 메소드*/card -> card.getCompany()
                                , Collectors.averagingDouble(card -> card.getLimitMoney()
                                )
                        )
                );


    }
}

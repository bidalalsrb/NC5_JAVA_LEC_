package chap20_lambda;

import chap20_lambda.clazz.Convert;
import chap20_lambda.clazz.MoneyConvert;

public class _05_referenceMethod {
    public static void main(String[] args) {

        action(MoneyConvert::convert);
        MoneyConvert mcv = new MoneyConvert();
//        action(mcv :: instancConvert);
    }

    public static  void action(Convert con){
        int convertMoney = 0;
        int result = con.conv(1000000, '$');
        System.out.println("변환된 돈 : $ " + result);
    }
}

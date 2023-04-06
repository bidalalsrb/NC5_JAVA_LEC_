package chap20_lambda;

import chap20_lambda.clazz.UpperCaseInter;

public class _06_referParamMehod {
    public static void main(String[] args) {
        action(String::toUpperCase);

    }
    public static void action(UpperCaseInter uci) {
        String result = uci.allUpperCase("bit");
        System.out.println(result);
    }
}

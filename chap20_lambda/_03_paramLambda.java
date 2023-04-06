package chap20_lambda;

import chap20_lambda.clazz.MulandDiv;

public class _03_paramLambda {
    public static void main(String[] args) {
        MulandDiv mad = new MulandDiv();

        mad.action(a -> System.out.println(a * a));
        mad.action2((a, b) -> {
            System.out.println(a / b);
            System.out.println((a * a) / (b * b));
        });
    }
}

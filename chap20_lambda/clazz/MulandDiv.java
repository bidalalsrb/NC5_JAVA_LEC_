package chap20_lambda.clazz;

public class MulandDiv {
    public void action(Mul mul) {
        int a = 10;

        mul.multiply(a);
    }

    public void action2(Div div) {
        int a = 10;
        int b = 5;

        div.divide(a,b);
    }
}

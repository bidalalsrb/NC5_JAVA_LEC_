package HomeWork0321.MID;

import HomeWork0321.MID.cal.cal;
import HomeWork0321.MID.cal.cal.Add;
import HomeWork0321.MID.cal.cal.Div;
import HomeWork0321.MID.cal.cal.Mul;
import HomeWork0321.MID.cal.cal.Sub;

public class Calculator {
    public static void main(String[] args) {
        cal calc = new cal();
        Add add = calc.new Add();
        Sub sub = calc.new Sub();
        Mul mul = calc.new Mul();
        Div div = calc.new Div();

        System.out.println(add.add(10,5));
        System.out.println(sub.sub(10,5));
        System.out.println(mul.mul(10,5));
        System.out.println(div.div(10,5));

    }


}

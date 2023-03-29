package chap09_polymorphism;

import chap09_polymorphism.product.SamsungTv;
import chap09_polymorphism.product.Tv;

public class _03_withPolymoriphsm {
    public static void main(String[] args) {
        //1. 다형성을 이용해 Tv바꾸기
        Tv tv = new SamsungTv() ;

        tv.powerOn();
        tv.operate(13);
        tv.powerOff();
        tv.powerOn();
        tv.toString();

    }
}

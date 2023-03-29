package chap09_polymorphism;

import chap09_polymorphism.product.LGTv;
import chap09_polymorphism.product.SamsungTv;

public class _02_withoutPolymorphism {
    public static void main(String[] args) {
        //1. 다형성을 사용하지 않고 Tv 바꾸기
        LGTv lgtv = new LGTv();
        SamsungTv stv = new SamsungTv();

        stv.powerOn();
        stv.operate(13);
        stv.powerOff();
        stv.powerOn();


    }
}

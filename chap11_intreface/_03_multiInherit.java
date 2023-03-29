package chap11_intreface;

import chap11_intreface.device.ElectronicDevice;
import chap11_intreface.device.LGTV;
import chap11_intreface.device.Tv;

public class _03_multiInherit {
    public static void main(String[] args) {

        Tv tv = new LGTV();

        //static 메소드를 사용하려면
        //static 메소드가 선언된 클래스를 호출한다
        ElectronicDevice.warn();
        //static 메소드는 상속받은 자식클래스에서
        //호출은 불가능하다.

    }
}

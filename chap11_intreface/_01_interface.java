package chap11_intreface;

import chap11_intreface.buildings.HighBuilding;
import chap11_intreface.buildings.building;

public class _01_interface {
    public static void main(String[] args) {
        // 인터페이스는 인스턴스화가 불가능하기 때문에
        // 상속받은 자식클래스를 인스턴스화해서 사용한다.
        building bd = new HighBuilding();
        bd.build();
        bd.turnOnAircon();
        int price = bd.getParkingPrice(60);
        System.out.println("총 주차비는 : " + price );

    }
}

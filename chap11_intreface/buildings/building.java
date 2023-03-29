package chap11_intreface.buildings;

public interface building {
    //모든 변수는 상수화됨
    String price = "expensive";
    int floors = 120;

    //메소드는 자동으로 추상화됨
     void build();
     void turnOnAircon();
     int getParkingPrice(int time);
}

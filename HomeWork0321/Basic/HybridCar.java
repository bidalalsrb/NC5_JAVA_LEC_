package HomeWork0321.Basic;

public class HybridCar implements Car{
    @Override
    public void speedUp() {
        System.out.println("속도를 올린다");
    }

    @Override
    public void speedDown() {
        System.out.println("속도를 내린다");
    }

    @Override
    public void charge() {
        System.out.println("충 전 중");
    }

    @Override
    public void addFuel() {
        System.out.println("주 유 중");
    }
}

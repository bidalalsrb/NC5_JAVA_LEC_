package chap09_polymorphism.product;

public class Tv extends ElectronicDevice {
    public int lastChannel = 1;

    @Override
    public void powerOn() {
        System.out.println("Tv의 전원을 켭니다");
        moveTo(lastChannel);
    }

    @Override
    public void powerOff() {
        System.out.println("Tv의 전원을 끕니다");
    }

    public void operate(int channel) {
        lastChannel = channel;
        moveTo(channel);
    }

    public void moveTo(int channel) {
        System.out.println(channel + "채널로 이동합니다");
    }

    public void channelUp() {
        lastChannel++;
    }

    public void channelDown() {
        lastChannel--;
    }
}

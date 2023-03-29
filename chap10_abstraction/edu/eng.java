package chap10_abstraction.edu;

public class eng extends aca {
    @Override
    public void teach() {
        System.out.println("영어학원에서 가르친다");
    }

    @Override
    public void study() {
        System.out.println("영어학원에서 숙제를 한다");
    }

    @Override
    public void relax() {
        System.out.println("영어학원에서 쉰다");
    }

    @Override
    public void check() {
        System.out.println("영어학원에서 출석한다");
    }
}

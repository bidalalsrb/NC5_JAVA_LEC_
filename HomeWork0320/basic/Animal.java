package HomeWork0320.basic;

import chap07_Inherit.animal.Whale;

public class Animal {
    public int age;
    public int teeth;
    public String color;

    public void zoo() {
        System.out.println("나이 : " + age);
        System.out.println("이빨 : " + teeth);
        System.out.println("색상 : " + color);
    }

    public void eat() {
        System.out.println("먹이를 먹는다");
    }


    public static void main(String[] args) {
        whale wh = new whale();
        Cat cat = new Cat();
        Lion lion = new Lion();
        Tiger tiger = new Tiger();

        wh.eat();
        cat.eat();
        lion.hunt();
        tiger.swim();
    }
}


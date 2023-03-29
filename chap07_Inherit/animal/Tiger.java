package chap07_Inherit.animal;

public class Tiger extends Animal {
    public String meat;
    public boolean isswimming;
    public boolean hasPattern;
    public String color;

        /*
         * // 부모 속성 초기화 this.age = age; this.size = size; this.legCnt = legCnt;
         * this.hasWing = hasWing;
         */

    

    public Tiger() {
    }

    ;

    public void eat() {
        System.out.println(meat + "를 먹는다. ");
    }

    public void swim() {
        if (isswimming) {
            System.out.println("현재 수영중입니다");
        } else {
            System.out.println("현재 사냥중입니다");
        }
    }

    public void printPattern() {
        if (hasPattern) {
            System.out.println("이 호랑이는 무늬를 가지고 있습니다. ");
        } else {
            System.out.println("이 호랑이는 무늬를 가지고 있지 않습니다. ");
        }
    }

}

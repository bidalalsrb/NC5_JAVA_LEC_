package Pratice;

public class test1 {
    private double a;
    private double b;
    test1(){};

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public test1(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        test1 test1 = new test1();
    }

    public static void qp(int a){
        a = 10;
    }
}

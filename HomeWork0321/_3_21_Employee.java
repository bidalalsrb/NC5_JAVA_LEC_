package HomeWork0321;

public abstract class _3_21_Employee {
    int eno;
    String name;
    static int pay;

    public _3_21_Employee(int eno, String name, int pay) {
        this.eno = eno;
        this.name = name;
        this.pay = pay;
    }

    public abstract double getMonthPay();

    public void showEmployeeInfo() {
        System.out.println("사번 : " + eno + "\n이름 : " + name + "\n급여 : " + pay);
    }
}

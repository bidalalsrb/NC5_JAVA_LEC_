package HomeWork0321;

public class _3_21_fullTimeJob extends _3_21_Employee {

    int bonus;

    public _3_21_fullTimeJob(int eno, String name, int pay, int bonus) {
        super(eno, name, pay);
        this.bonus = bonus;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getMonthPay() {
        // TODO Auto-generated method stub
        int monthPay = 0;
        monthPay = (_3_21_fullTimeJob.pay / 12) + (bonus / 12);
        return monthPay;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("사번 : " + eno + "\n이름 : " + name + "\n월급 : " + getMonthPay() + "\n보너스 : " + bonus);
    }


}
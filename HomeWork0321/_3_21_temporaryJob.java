package HomeWork0321;

public class _3_21_temporaryJob extends _3_21_Employee {

    int hireYear;

    public _3_21_temporaryJob(int eno, String name, int pay, int hireYear) {
        super(eno, name, pay);
        this.hireYear = hireYear;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getMonthPay() {
        // TODO Auto-generated method stub
        int monthPay = 0;
        monthPay = _3_21_temporaryJob.pay / 12;
        return monthPay;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("사번 : " + eno + "\n이름 : " + name + "\n월급 : " + getMonthPay() + "\n고용연도 : " + hireYear);
    }

}

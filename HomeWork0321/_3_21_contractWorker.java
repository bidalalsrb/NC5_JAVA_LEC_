package HomeWork0321;

public class _3_21_contractWorker extends _3_21_Employee{

    int workDay;

    public _3_21_contractWorker(int eno, String name, int pay, int workDay) {
        super(eno, name, pay);
        this.workDay = workDay;
        // TODO Auto-generated constructor stub
    }

    @Override
    public double getMonthPay() {
        // TODO Auto-generated method stub
        int monthPay = 0;
        monthPay = _3_21_contractWorker.pay * workDay;
        return monthPay;
    }

    @Override
    public void showEmployeeInfo() {
        System.out.println("사번 : " + eno + "\n이름 : " + name + "\n월급 : " + getMonthPay() + "\n일한 날 : " + workDay);
    }

}
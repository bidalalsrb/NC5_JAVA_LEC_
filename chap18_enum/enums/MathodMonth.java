package chap18_enum.enums;

public enum MathodMonth {
    JAN(1), FEB(2), MAR(3), APR(4), MAY(5), JUN(6),
    JUL(7), AUG(8), SEP(9), OCT(10), NOV(11), DEC(12);

    private int monthVal;

    public int getMonthVal() {
        return monthVal;
    }

    MathodMonth(int monthVal) {
        this.monthVal = monthVal;
    }

    public static void printMonth(int month) {
        MathodMonth[] monthArr = values();
        for (int i = 0; i < monthArr.length; i++) {
            if (monthArr[i].getMonthVal() == month) {
                System.out.println("입력한 달은 " + monthArr[i].getMonthVal() + "월 입니다.");
            }
        }
    }

    public void printAddMonth(int month) {
        if (this.getMonthVal() + month <= 12) {
            System.out.println(month + "개월 뒤는 " + (this.getMonthVal() + month) + "월 입니다.");
        } else {
            int remain = this.getMonthVal() + month - 12;
            if (remain>12)
            System.out.println(month + "개월 뒤는 " + (JAN.monthVal + remain - 1) + "월 입니다.");

        }
    }
}

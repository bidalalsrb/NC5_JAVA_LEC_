package HomeWork0404.Enum;

//3. 12달을 상수로 만들어서 enum을 선언하고 첫 번째 값은 평년일 때
// 그 달의 일수 두 번째 값은 윤년일 때 그 달의 일수로 설정하고
// 사용자가 년도를 입력하면 해당 년도의 1, 2, 3, 4, 5월의 일수의
// 총합을 출력하는 메소드를 구현하세요. sumDays(int year)

public enum enum3ex {
    JAN(31,31), FEB(29,29), MAR(31,31), APR(30,30), MAY(31,31),
    JUN(30,30),JUL(31,31), AUG(30,30), SEP(31,31), OCT(30,30), NOV(31,31), DEC(31,31);

    private int everyYear;
    private int notYear;

    enum3ex(int everyYear, int notYear) {
        this.everyYear = everyYear;
        this.notYear = notYear;
    }

    public int getEveryYear() {
        return everyYear;
    }

    public int getNotYear() {
        return notYear;
    }
}

package chap18_enum;

public enum Seson {
    SPRING("봄") {
        @Override
        public void printSeasonMonth() {
            System.out.println(SPRING + " 은 3,4,5월 입니다");
        }
    }, SUMMER("여름") {
        @Override
        public void printSeasonMonth() {
            System.out.println(SUMMER + " 은 6,7,8월 입니다");

        }
    }, FALL("가을") {
        @Override
        public void printSeasonMonth() {
            System.out.println(FALL + " 은 9,10,11월 입니다");

        }
    }, WINTER("겨울") {
        @Override
        public void printSeasonMonth() {
            System.out.println(WINTER + " 은 12,1,2월 입니다");

        }
    };

    private String koreaSeason;

    public String getKoreaSeason() {
        return koreaSeason;
    }

    Seson(String koreaSeason) {
        this.koreaSeason = koreaSeason;
    }

    public abstract void printSeasonMonth();
}

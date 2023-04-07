package chap21_stream.clazz;

public class CreditCard {
    private String company;
    private String cardName;
    private int limitMoney;

    @Override
    public String toString() {
        return "CreditCard{" +
                "company='" + company + '\'' +
                ", cardName='" + cardName + '\'' +
                ", limitMoney=" + limitMoney +
                '}';
    }

    public CreditCard(String company, String cardName, int limitMoney) {
        this.company = company;
        this.cardName = cardName;
        this.limitMoney = limitMoney;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCardName() {
        return cardName;
    }


    public int getLimitMoney() {
        return limitMoney;
    }


}

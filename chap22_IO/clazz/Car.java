package chap22_IO.clazz;

import java.io.Serializable;

//직렬화가 가능하도록 Serializable 인터페이스를 상속
//직렬화와 역직렬화가 일어날 때 사용되는 클래스는 동일한 클래스여야 한다.
public class Car implements Serializable {
    //직렬화할 때 SerialVersionUID 값을 설정해서
    //역직렬화할 때도 같은 클래스를 사용할 수 있도록 구분자를 넣어준다.
//    public static final long serialVersionUID = 1;
    private String company;
    private String model;
    private double maxSpeed;
    private int price;
    //직렬화 제외하고 싶은 멤버 변수는 타임 앞에
    //transient 키워드를 붙여준다.
    private transient int produceYear;

    public Car(String company, String model, double maxSpeed, int price) {
        this.company = company;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

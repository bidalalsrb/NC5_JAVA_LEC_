package chap22_IO;

import chap22_IO.clazz.Car;

import java.io.*;

public class _13_objcetStream {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mg\\Desktop\\JAVA\\oos.txt"));
            Car c1 = new Car("현대","아반떼",150.6,2000);
            Car c2 = new Car("현대","쏘나타",185.3,3000);
            // 객체를 직렬화하여 멤버변수들을 byte로 변경해서 출력
            oos.writeObject(c1);
            oos.writeObject(c2);

            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\mg\\Desktop\\JAVA\\oos.txt"));

            Car car1 = (Car) ois.readObject();
            Car car2 = (Car) ois.readObject();

            System.out.println(car1.toString());
            System.out.println(car2.toString());

            ois.close();




        } catch (FileNotFoundException fe) {

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {

        }

    }
}

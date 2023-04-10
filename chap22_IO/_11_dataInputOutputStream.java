package chap22_IO;

import chap22_IO.clazz.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class _11_dataInputOutputStream {
    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream
                    (new FileOutputStream("C:\\Users\\mg\\Desktop\\JAVA\\car.txt"));
            dos.writeUTF("현대");
            dos.writeUTF("아반떼");
            dos.writeDouble(150.5);
            dos.writeInt(2000);

            dos.writeUTF("현대");
            dos.writeUTF("쏘나타");
            dos.writeDouble(189.3);
            dos.writeInt(3000);

            dos.writeUTF("현대");
            dos.writeUTF("제네시스");
            dos.writeDouble(220.7);
            dos.writeInt(5000);

            dos.flush();
            dos.close();

            DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\mg\\Desktop\\JAVA\\car.txt"));
            List<Car> carList = new ArrayList<Car>();

            for (int i = 0; i < 3; i++) {
                String company = dis.readUTF();
                String model = dis.readUTF();
                double maxSpeed = dis.readDouble();
                int price = dis.readInt();
                Car c = new Car(company,model,maxSpeed,price);

                carList.add(c);
            }
            for (int i = 0; i < carList.size(); i++) {
                System.out.println(carList.get(i).toString());
            }
            dis.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException ioe) {

        } catch (Exception e) {

        }
    }
}

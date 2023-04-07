package chap22_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _04_inputStreamRead {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Users/mg/Desktop/JAVA/ex02.txt");
        byte[] readData = new byte[5];
        while (true) {
            //byte로 입력한 데이터라 byte로 받아와야
            //부호가 정확하게 출력된다
            int data = (byte)is.read(readData);
            if (data == -1) {
                break;
            }
            for (int i = 0; i < data; i++) {
                System.out.println(readData[i]);
            }
        }
        is.close();
    }
}

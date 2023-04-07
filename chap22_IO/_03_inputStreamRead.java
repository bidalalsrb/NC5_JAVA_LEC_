package chap22_IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class _03_inputStreamRead {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("C:/Users/mg/Desktop/JAVA/ex01.txt");
        while (true) {
            int data = is.read();
            if (data == 01) {
                break;
            }
            System.out.println(data);
        }
        is.close();
    }
}

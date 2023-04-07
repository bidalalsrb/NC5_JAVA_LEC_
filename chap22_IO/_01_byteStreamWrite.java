package chap22_IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class _01_byteStreamWrite {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Users/mg/Desktop/JAVA/ex02.txt");
            //1. byte를 1byte씩 출력
//            byte num1 = -128;
//            byte num2 = 127;
//            byte num3 = 0;
//            os.write(num1);
//            os.write(num2);
//            os.write(num3);

            //1-1 바이트 배열로 출력
            byte[] byteArr = new byte[5];
            for (int i = 1; i <= 5; i++) {
                byteArr[i] = (byte) (i * 5);
            }
            os.write(byteArr);
//             index == 1부터 3출력

            //2. 버퍼 비워주기
            os.flush();
            //3.스트림 메모리에서 해제
            os.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

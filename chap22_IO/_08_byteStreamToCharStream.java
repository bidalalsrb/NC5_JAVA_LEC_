package chap22_IO;
import java.io.*;
public class _08_byteStreamToCharStream {
    public static void main(String[] args) {
        write("Aaa");
        String str = read();
        System.out.println(str);
    }
    public static void write(String str) {
        try {
            OutputStream os = new FileOutputStream("C:/Users/mg/Desktop/JAVA/hp01.txt");
            //OutputStreamWriter를 이용해서
            // 바이트스트림 -> 문자스트림으로 변환
            Writer writer = new OutputStreamWriter(os, "UTF-8");
            writer.write(str);


            writer.flush();
            writer.close();
        } catch (FileNotFoundException fne) {
            throw new RuntimeException(fne);
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception ee) {
            System.out.println(ee.getMessage());
        }
    }
    //InputStreamReader를 이용해서
    // 바이트스트림 -> 문자스트림으로 변환해주는 메소드
    public static String read() {
        String returnStr = "";
        try {
            InputStream is = new FileInputStream("C:\\Users\\mg\\Desktop\\JAVA\\hp01.txt");
            Reader reader = new InputStreamReader(is);
            char[] chArr = new char[4096];
            while (true) {
                int data = reader.read(chArr);
                if (data == -1) {
                    break;
                }
                for (int i = 0; i < data; i++) {
                    returnStr += String.valueOf(chArr[i]);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException IOe) {
            throw new RuntimeException(IOe);
        }
        return returnStr;
    }

}
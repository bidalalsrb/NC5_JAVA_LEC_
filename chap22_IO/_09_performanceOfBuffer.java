package chap22_IO;

import java.io.*;

public class _09_performanceOfBuffer {
    public static void main(String[] args) {

        try {
            Reader rdname = new FileReader("C:\\Users\\mg\\Desktop\\JAVA\\name.txt");
            Reader rdphone = new FileReader("C:\\Users\\mg\\Desktop\\JAVA\\phone.txt");
            BufferedReader brdname = new BufferedReader(rdname);
            BufferedReader brdphone = new BufferedReader(rdphone);

            String[] name = new String[100];
            String[] phonenum = new String[100];
            int index = 0;
            while (true) {
                //성능 향상 보조스트림의 readLine() 사용해서
                // 문자열 한 줄씩 읽어오기
                String linename = brdname.readLine();
                String linephone = brdphone.readLine();
                // line이 null이면 다음 값이 없다.
                // while문 종료
                if (linename == null && linephone == null) {
                    break;
                }
                name[index++] = linename.split(" ")[0];
                phonenum[index++] = linephone.split(" ")[1];
                for (int i = 0; i < index; i++) {
                    System.out.println(name[i] + " : " + phonenum[i]);
                }
            }
            brdname.close();
            brdphone.close();

        } catch (FileNotFoundException ffe) {
            System.out.println(ffe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}

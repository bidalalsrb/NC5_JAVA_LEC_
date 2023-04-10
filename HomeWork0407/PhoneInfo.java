package HomeWork0407;

import java.io.*;

public class PhoneInfo {
    //이름 100개와 전화번호 100개를 담을수 있는 배열 2개(String)
    String[] name = new String[100];
    String[] phoneNum = new String[100];

    //배열의 현재 인덱스를 담고 있을 변수
    int currentIndex = 0;

    public PhoneInfo() {
        String sName = "";
        String phone = "";

        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\mg\\Desktop\\JAVA\\namephone.txt"));
            char[] chArr = new char[4096];
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
            }
            reader.close();
        } catch (FileNotFoundException fnfe) {
            System.out.println("파일이 존재하지 않습니다.");
            System.out.println("정보를 입력하고 저장해주세요.");
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    //전달받은 이름과 전화번호를 저장하는 메소드
    //insertPhoneNum
    public void insertPhoneNum(String name, String PhoneNum) {
        this.name[currentIndex] = name;
        this.phoneNum[currentIndex] = PhoneNum;
        currentIndex++;
    }

    public void printAllPhoneNum() {
        for (int i = 0; i < currentIndex; i++) {
            System.out.println("이름 : " + name[i] +
                    ", 전화번호 : " + phoneNum[i]);
        }
    }

    public void printPhoneNum(int index) {
        if (name[index - 1] == null) {
            System.out.println("해당 인덱스의 정보가 존재하지 않습니다.");
        } else {
            System.out.println("이름 : " + name[index - 1] +
                    ", 전화번호 : " + phoneNum[index - 1]);
        }
    }

    public void saveData() {
        try {
            Writer writer = new FileWriter("C:\\Users\\mg\\Desktop\\JAVA\\name.txt");
            String svNamePhone = "";
            for (int i = 0; i < currentIndex; i++) {
                svNamePhone = svNamePhone + name[i] + " " + phoneNum[i];
                writer.write(svNamePhone);
//            writer.newLine();
            }
        } catch (IOException ioe) {
            System.out.println(ioe.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}

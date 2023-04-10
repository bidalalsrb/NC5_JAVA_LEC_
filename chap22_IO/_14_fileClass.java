package chap22_IO;

import java.io.File;
import java.io.IOException;

public class _14_fileClass {
    public static void main(String[] args) {
        //1. 파일 객체 생성
        try {
            File newDirectory = new File("C:\\Users\\mg\\Desktop\\JAVA\\test");
            File newFile = new File("C:\\Users\\mg\\Desktop\\JAVA\\fileEx01.txt");

            //2. 파일, 폴더 생성
            if (!newDirectory.exists()) {
                newDirectory.mkdir();
            }
            if (!newFile.exists()) {
                newFile.createNewFile();
            }
            //3. 파일 객체 생성
            File directory = new File("C:\\Users\\mg\\Desktop\\JAVA");
            File deleteFile = new File("C:\\Users\\mg\\Desktop\\JAVA\\name.txt");
            File[] fileArr = directory.listFiles();
            for (File f : fileArr) {
                System.out.println(f.getName());
            }
            System.out.println("------------------------------------------");
            boolean isDeleted = deleteFile.delete();


            if (isDeleted){
                System.out.println("파일이 정상적으로 삭제되었씁니다.");
            }
            else {
                System.out.println("파일 삭제에 실패했습니다.");
            }

        } catch (IOException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

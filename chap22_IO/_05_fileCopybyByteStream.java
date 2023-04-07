package chap22_IO;

import java.io.*;

public class _05_fileCopybyByteStream {
    public static void main(String[] args) throws IOException {
        String originFileNm = "C:\\Users\\mg\\Desktop\\JAVA\\images\\eclipse 구조.jpg";
        String copyFileNm = "C:\\Users\\mg\\Desktop\\JAVA\\images\\eclipseCopy2 구조.jpg";
        InputStream is = new FileInputStream(originFileNm);
        OutputStream os = new FileOutputStream(copyFileNm);
//        byte[] readData = new byte[1024];
//        while (true){
//            int cnt = is.read(readData);
//            if (cnt == -1){
//                break;
//            }
//            os.write(readData);
//        }
        //java9부터 transferTo 메소드가 생겼다.
        is.transferTo(os);
        os.flush();
        is.close();
        os.close();
    }
}

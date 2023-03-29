package chap15_usefulClass;

import java.util.Scanner;

public class _05_Scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String s2 ;

        s2 = str1.replace("비트","")
                .replace("네이버","").replace("클라우드","");
        System.out.println(s2);

    }
}

package HomeWork0322;

import java.util.Scanner;

public class basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        System.out.println(in.length());
        String str = "";
        if ((in.length() % 2) == 0) {
            str = in.substring((in.length()/2)-1,(in.length()/2+1));
        } else {
            str += in.substring((in.length() / 2),(in.length()/2)+1);
        }
        System.out.println(str);


    }
}

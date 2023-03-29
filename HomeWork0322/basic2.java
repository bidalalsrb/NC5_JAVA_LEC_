package HomeWork0322;

import java.util.Scanner;

public class basic2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        int cnt=0;

        cnt = ip.length() - ip.replace("가","").replace("바","").length();
        System.out.println("가 바 개수는  = " + cnt);
        if (cnt ==0){
            System.out.println("가, 바가 없어요");
        }
    }
}

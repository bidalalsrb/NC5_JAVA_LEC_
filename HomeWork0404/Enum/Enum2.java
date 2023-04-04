package HomeWork0404.Enum;

import java.util.Scanner;

public class Enum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        enum2ex[] cof = enum2ex.values();
        int sum = 0;
        for (enum2ex e : cof) {
            System.out.println(e + " 추가");
            int eamenu = sc.nextInt();
            System.out.println(e + " 일반");
            int menu = sc.nextInt();
            sum += e.totalPrice(eamenu, menu);
//            System.out.println(e.totalPrice(eamenu,menu));
        }
        System.out.println(sum);
    }
}

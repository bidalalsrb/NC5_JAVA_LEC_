package HomeWork0327;

import java.util.ArrayList;
import java.util.Scanner;

public class basic01 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr.add(sc.nextInt());
            System.out.println(arr.get(i));
        }
        System.out.println(arr);
        sc.close();
    }
}

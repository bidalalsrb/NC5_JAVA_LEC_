package HomeWork0404.Enum;

import java.util.Scanner;

public class Enum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String countryNm = sc.nextLine();

        enum1ex[] conArr = enum1ex.values();

        for (enum1ex e : conArr) {
            if(countryNm.equals(e.getName())) {
                e.notifyFood(countryNm);
            }
            //e.notifyFood(e.getName());
        }
    }
}

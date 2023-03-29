package chap16_collectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _04_arrayListex02 {
    public static void main(String[] args) {
        // 사용자가 문자열을 입력
        // 길이가 10씩 만큼씩 잘라서
        // ArrayList에 저장
        // 남은 문자열에 길이가 10보다 작으면
        // 남은 문자열을 저장
        // ex) abcdefgijklmnop
        // [abcdefgij,klmnop]

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());
        List<StringBuilder> strList = new ArrayList<StringBuilder>();

        int length = sb.length();
        for (int i = 0; i < length; i += 10) {
            if (i + 10 < length){
                strList.add(new StringBuilder(sb.substring(i,i+10)));
            }
            else {
                strList.add(new StringBuilder(sb.substring(i)));
            }
            System.out.println(strList);
            }
        }


    }


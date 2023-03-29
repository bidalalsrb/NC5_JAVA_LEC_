package chap18_enum;

import chap18_enum.enums.RGB;

public class _04_useOfRGB {
    public static void main(String[] args) {
        RGB red = RGB.RED;
        RGB green = RGB.valueOf("GREEN");
        RGB blue = Enum.valueOf(RGB.class, "BLUE");

        System.out.println("빨간색은 " + red.getRed() + "," + red.getGreen() + "," + red.getBlue() );
        red.makeWhite();
        System.out.println("초록색은 " + green.getGreen());
        System.out.println("파란색은 " + blue.getBlue());
        System.out.println("----------------------------");
    }
}

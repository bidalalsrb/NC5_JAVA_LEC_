package chap18_enum;

import chap18_enum.enums.MathodMonth;

public class _05_methodOfEnum {
    public static void main(String[] args) {
        MathodMonth.printMonth(5);
        MathodMonth aug = MathodMonth.AUG;
        aug.printAddMonth(3);
        aug.printAddMonth(7);
    }
}

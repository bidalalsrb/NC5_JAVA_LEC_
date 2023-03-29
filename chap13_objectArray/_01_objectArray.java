package chap13_objectArray;

import chap13_objectArray.clazz.Lecture1;

public class _01_objectArray {
    public static void main(String[] args) {
        Lecture1[] lecArr = new Lecture1[3];

        lecArr[0] = new Lecture1("자바",30,50);
        lecArr[1] = new Lecture1("C언어",29,45);
        lecArr[2] = new Lecture1("자바",30,50);
        for (int i=0;i < lecArr.length;i++){
            lecArr[i].proceedLecture();
        }

    }
}

package HomeWork0405;

import HomeWork0405.clazz.Student;

import java.util.ArrayList;
import java.util.List;

//2. int sno, String sName, int score, String grade를 갖는 Student 클래스를 만들고
//    List<Student> studentList에
//    (1, 홍길동, 100), (2, 임꺽정, 75), (3, 장길산, 86), (4, 정도전, 97), (5, 이순신, 95)
//  를 저장하고 Stream으로 변환하여 점수가 95점 이상인 학생만 들어있는 Stream을 만드세요.

//3. 2번에서 만든 Stream에 grade가 A+로 저장된 새로운 Stream을 만들어서 출력하세요.
public class no2 {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, "홍길동", 100));
        studentList.add(new Student(2, "임꺽정", 75));
        studentList.add(new Student(3, "장길산", 86));
        studentList.add(new Student(4, "정도전", 97));
        studentList.add(new Student(5, "이순신", 95));

//        Stream<Student> sStream = studentList.stream();


        studentList.stream().filter(stu -> stu.getScore() >= 95).forEach(stu -> {
            stu.setGrade("A+");
            System.out.println(stu.toString());
        });

    }
}

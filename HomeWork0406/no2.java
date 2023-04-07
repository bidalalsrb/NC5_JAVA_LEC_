package HomeWork0406;

import HomeWork0406.clazz.HistoricPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

//2. HistoricPerson이란 클래스를 만들고 String name; String achievement; String country; 를 멤버변수로 만들고
//   getter/setter 메소드를 생성합니다. getPersonInfo(String achievement); 매개변수로 받아온 업적에 해당하는 역사적 인물의
//    정보를 리턴하는 기능을 만들고 메인메소드에서
//    (이도, 한글, 조선), (이순신, 임진왜란, 조선), (담덕, 세력확장, 고구려)
//    (장영실, 측우기, 조선), (이성계, 조선건국, 조선), (을지문덕, 살수대첩, 고구려), (이승만, 초대대통령, 대한민국), (고주몽, 고려건국, 고려),
//   (김구, 독립운동, 대한민국), (제갈공명, 책략가, 촉)
//   데이터를 갖는 List<HistoricPerson>를 만들어서
//   스트림으로 변환 후 사용자가 입력한 업적
//    하나만 갖는 스트림을 생성하고 출력하세요.
public class no2 {
    public static void main(String[] args) {
        List<HistoricPerson> historicPeople = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        historicPeople.add(new HistoricPerson("이도", "한글", "조선"));
        historicPeople.add(new HistoricPerson("이순신", "임진왜란", "조선"));
        historicPeople.add(new HistoricPerson("담덕", "세력확장", "고구려"));
        historicPeople.add(new HistoricPerson("장영실", "측우기", "조선"));
        historicPeople.add(new HistoricPerson("이성계", "조선건국", "조선"));
        historicPeople.add(new HistoricPerson("을지문덕", "살수대첩", "고구려"));
        historicPeople.add(new HistoricPerson("이승만", "초대대통령", "대한민국"));
        historicPeople.add(new HistoricPerson("고주몽", "고려건국", "고려"));
        historicPeople.add(new HistoricPerson("김구", "독립운동", "대한민국"));
        historicPeople.add(new HistoricPerson("제갈공명", "책략가", "촉"));
        System.out.println("업적을 입력하세용");
        String acStr = sc.nextLine();

//        System.out.println("2번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//
        Stream<HistoricPerson> person = historicPeople.stream()
                .map(ac -> ac.getPersonInfo(acStr))
                .filter(a -> !a.getAchievement().equals(null));
        person.forEach(a -> System.out.println(a));

//        System.out.println("3번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("이 를 입력해용");
        String LeeStr = sc.nextLine();

        //2번에서 만든 List를 스트림으로 변환하고 성이 '이'씨인 인물만 갖는 스트림을 만들고 출력하세요.111
        Stream<HistoricPerson> LeePerson = historicPeople.stream().filter(a -> a.getName().charAt(0) == LeeStr.charAt(0));
        LeePerson.forEach(a -> System.out.println(a));

//        System.out.println("4번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        System.out.println("");
        String conStr = sc.nextLine();

        //HistoricPerson에 getSameCountryPerson(String country)를 만들고
        //    2번에서 만든 List를 스트림으로 변환하고 사용자가 입력한 국가의 인물들만 모은 스트림으로 만들어서 출력하세요.
        Stream<HistoricPerson> conPerson = historicPeople.stream().filter(a -> a.getCountry().equals(conStr));
        conPerson.forEach(a -> System.out.println(a));

        System.out.println("5번ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

        //2번에서 만든 List를 스트림으로 변환하고 성이 두자 이상인 인물의 정보를 스트림으로 만들어서 출력하세요.(을지문덕, 제갈공명)
        Stream<HistoricPerson> twinPerson = historicPeople.stream().filter(a -> a.getName().length() == 4);
        twinPerson.forEach(a -> System.out.println(a));



    }
}

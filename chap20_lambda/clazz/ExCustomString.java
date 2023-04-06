package chap20_lambda.clazz;

public class ExCustomString {
    private String str;

    public ExCustomString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
    //함수형 인터페이스를 매개변수로 갖는 메소드가 호출되는 부분에서
    //함수형 인터페이스를 람다식으로 구현해준다.
    public String changeStr(char ch, UserChar uc){
        str = uc.findEngChar(ch, str);
        return str;
    }


    @Override
    public String toString() {
        return "ExCustomString{" +
                "str='" + str + '\'' +
                '}';
    }
}

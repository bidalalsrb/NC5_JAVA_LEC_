package chap13_objectArray.clazz;


public class object implements ILecture {
    private String eng = "";
    private String math = "";
    private String pro = "";

    @Override
    public void proceedLecture() {
        System.out.println(this.eng + "과목입니다" + this.math + this.pro);
    }

    public object(String eng, String math, String pro) {
        this.eng = eng;
        this.math = math;
        this.pro = pro;
    }
}

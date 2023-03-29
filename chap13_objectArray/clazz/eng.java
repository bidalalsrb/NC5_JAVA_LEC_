package chap13_objectArray.clazz;

public class eng implements ILecture{
    private String eng;

    public eng(String eng) {
        this.eng = eng;
    }
    @Override
    public void proceedLecture() {
        System.out.println(this.eng + " 과목은 ");

    }
}

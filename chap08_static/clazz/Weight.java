package chap08_static.clazz;

public class Weight {
    public void twoWeightSum() {
        int a = 76;
        int b = 65;
        String sum = Add.add(a, b, "kg");
        System.out.println(sum);
    }
    public void twoWeightGranSum(){
        int a = 76; int b = 65;
        String sum = Add.add(a*1000,b*1000,"g");
        System.out.println(sum);
    }
}

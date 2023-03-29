package HomeWork0328.Basic;

public class basic1<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public static void main(String[] args) {
        basic1<String> gene = new basic1<String >();
        gene.setT("qwe");
        System.out.println(gene.getT());

    }
}

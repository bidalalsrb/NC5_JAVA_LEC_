package HomeWork0320.mid;
//1. 다음 두 개의 static메소드를 가진 ArrayUtility클래스를 만들어보고 사용해보세요
//  static double[] intToDouble(int[] source);	// int배열을 double배열로 변환
//  static int[] doubleToInt(double[] source);	// double배열을 int배열로 변환
public class ArrayUtility {
    static double[] intToDouble(int[] source) {
        double resource[] = new double[source.length];
        for (int i = 0; i < source.length; i++) {
            resource[i] = (double) source[i];
        }
        return resource;
    }

    // double형 배열을 int형 배열로 변환
    static int[] doubleToInt(double[] source) {
        int resource[] = new int[source.length];
        for (int i = 0; i < resource.length; i++) {
            resource[i] = (int) source[i];
        }
        return resource;
    }

    public static void main(String[] args) {
        int num_int[] = { 1, 2, 3, 4 };
        double num_double[] = { 1.0, 2.0, 3.0, 4.0 };

        int new_int[] = new int[num_double.length]; // 새로운 int형 배열 생성
        double new_double[] = new double[num_int.length]; // 새로운 double 형 배열 생성

        new_int = ArrayUtility.doubleToInt(num_double); // double형을 int형으로
        new_double = ArrayUtility.intToDouble(num_int); // int형을 double형으로

        // int형 배열과 double형으로 변환한 배열 출력
        System.out.print("int type : ");
        for (int i = 0; i < num_int.length; i++)
            System.out.print(num_int[i] + " ");
        System.out.print("\nIntToDouble : ");
        for (int i = 0; i < num_int.length; i++)
            System.out.print(new_double[i] + " ");

        System.out.println("\n");

        // double형 배열과 int형으로 변환한 배열 출력
        System.out.print("double type : ");
        for (int i = 0; i < num_double.length; i++)
            System.out.print(num_double[i] + " ");
        System.out.print("\nDoubleToInt : ");
        for (int i = 0; i < num_double.length; i++)
            System.out.print(num_int[i] + " ");
    }
}

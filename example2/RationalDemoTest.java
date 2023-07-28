package example2;

public class RationalDemoTest {
    public static void main(String[] args) {
        int[] x = RationalDemo.rational(1, 2);
        int[] y = RationalDemo.rational(2, 4);
        int[] z = RationalDemo.rational(4, 8);
        // boolean same = add(x, y) == rational(1, 1);
        // System.out.printf("%d / %d%n", numerator);
        System.out.println(RationalDemo.toString(x));
        System.out.println(RationalDemo.toString(y));
        System.out.println(RationalDemo.toString(z));
        System.out.println(RationalDemo.equals(RationalDemo.add(x, y), RationalDemo.rational(1, 1)));


    }
}

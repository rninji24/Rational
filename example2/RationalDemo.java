package example2;

public class RationalDemo {
    public static String toString(int[] x) {
        return (numerator(x) + " / " + denomiator(x));
    }

    public static int[] rational(int a, int b) {
        int[] rational = {a, b};
        nomalize(rational);
        return rational;
    }

    private static void nomalize(int[] rational) {
        int v = gcd(rational[0], rational[1]);
        rational[0] = rational[0] / v;
        rational[1] = rational[1] / v;
    }

    public static int numerator(int[] rational) {

        return rational[0];
    }

    public static int denomiator(int[] rational) {

        return rational[1];
    }

    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    public static boolean equals(int[] x, int[] y) {

        return (numerator(x) == numerator(y)) && (denomiator(x) == denomiator(y));
    }

    public static int[] add(int[] x, int[] y) {
        int numerator = numerator(x) * denomiator(y) + numerator(y) * denomiator(x);
        int denomiator = denomiator(x) * denomiator(y);
        return rational(numerator, denomiator);
    }
}



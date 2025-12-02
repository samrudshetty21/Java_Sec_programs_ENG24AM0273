public class MathUtils {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class OverloadingDemo {
    public static void main(String[] args) {
        MathUtils mu = new MathUtils();

        System.out.println(mu.add(2, 3));
        System.out.println(mu.add(1, 2, 3));
        System.out.println(mu.add(2.5, 3.2));
    }
}

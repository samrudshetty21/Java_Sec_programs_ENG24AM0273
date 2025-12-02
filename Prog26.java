class Test {
    void print(Test obj) {
        System.out.println("Method is called");
    }

    void call() {
        print(this);
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.call();
    }
}

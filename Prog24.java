class Test {
    Test getObj() {
        return this;
    }

    void show() {
        System.out.println("this keyword example");
    }
}

public class Main {
    public static void main(String[] args) {
        Test t = new Test();
        t.getObj().show();
    }
}

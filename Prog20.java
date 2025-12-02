class Rectangle {
    int length, width;

    Rectangle() {
        this(5, 5);
    }

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    void area() {
        System.out.println("Area: " + (length * width));
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.area();
    }
}

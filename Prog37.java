public class Rectangle {
    int length;
    int width;

    Rectangle(int l, int w) {
        length = l;
        width = w;
    }
}

public class AreaCalculator {
    public int calculateArea(Rectangle rect) {
        return rect.length * rect.width;
    }
}

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 8);
        AreaCalculator calc = new AreaCalculator();
        int area = calc.calculateArea(box);
        System.out.println("Area: " + area);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    Area getArea() {
        double a = Math.PI * radius * radius;
        return new Area(a);
    }
}

class Area {
    double value;

    Area(double value) {
        this.value = value;
    }
}

class Main {
    public static void main(String[] args) {
        Circle c = new Circle(3.0);
        Area areaObj = c.getArea();
        System.out.println("Area: " + areaObj.value);
    }
}

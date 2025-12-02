class Student {
    String name;
    int age;
    String course;

    Student() {
        this("Unknown", 0, "Not Assigned");
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        this(name, age, "General");
        System.out.println("Two-argument constructor called");
    }

    Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
        System.out.println("Three-argument constructor called");
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class ThisConstructorExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Aman", 21);
        s2.display();
        Student s3 = new Student("Neha", 22, "Computer Science");
        s3.display();
    }
}

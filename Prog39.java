class Student {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

class Example {
    static void updateMarks(Student s, int extra) {
        s.marks += extra;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Jit", 80);
        updateMarks(s1, 10);
        System.out.println(s1.name + ": " + s1.marks);
    }
}

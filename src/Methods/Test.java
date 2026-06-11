package Methods;

class Student {
    int age;
}

public class Test {
    static void change(Student s) {
        s.age = 30;
    }
    public static void main(String[] args) {
        Student st = new Student();
        st.age = 20;

        change(st);

        System.out.println(st.age);
    }
}

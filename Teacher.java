package Workshop.Sample;

public class Teacher extends Human {

    Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher() {

    }

    void teachStudents() {
        System.out.println(name + " is now teaching students.");
    }
}


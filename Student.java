package Workshop.Sample;
import java.lang.Math;
public class Student extends Human {

    int knowledge;
    int marks;

    Student(String name, int age) {
        super(name, age);
        knowledge = study();
        marks = giveExam(knowledge);
    }

    Student() {

    }


    int study() {
        int min = 0, max = 100;
        int knowledge = min + (int) (Math.random() * ((max - min) + 1));
        return knowledge;
    }

    int giveExam(int knowledge) {
        int marks, min = 0, max = 9;
        {
            if (knowledge > 90) {
                min = 90;
                max = 100;
            } else if (knowledge > 80) {
                min = 80;
                max = 89;
            } else if (knowledge > 70) {
                min = 70;
                max = 79;
            } else if (knowledge > 60) {
                min = 60;
                max = 69;
            } else if (knowledge > 50) {
                min = 50;
                max = 59;
            } else if (knowledge > 40) {
                min = 40;
                max = 49;
            } else if (knowledge > 30) {
                min = 30;
                max = 39;
            } else if (knowledge > 20) {
                min = 20;
                max = 29;
            } else if (knowledge > 10) {
                min = 10;
                max = 19;
            } else if (knowledge > 0) {
                min = 0;
                max = 9;
            }
        }
        marks = min + (int) (Math.random() * ((max - min) + 1));
        return marks;
    }

}

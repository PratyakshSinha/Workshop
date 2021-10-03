package Workshop.Sample;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {

    public static void main(String[] args) {

        Student obj1 = new Student();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter no of teachers:");
        int t = Integer.parseInt(input.nextLine());
        Teacher[] A = new Teacher[10];

        System.out.println("Enter no of students:");
        int s = Integer.parseInt(input.nextLine());
        Student[] B = new Student[10];

        System.out.println("Enter details of teachers:");
        for(int i = 0;i<t;i++){
            System.out.print("Name: ");
            String name = input.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(input.nextLine());
            Teacher newTeacher = new Teacher(name,age);
            A[i] = newTeacher;
        }
        System.out.println("Printing Teacher's Data: ");
        for(int i=0;i<t;i++){
            System.out.println("Name -> "+ A[i].name +"   Age ->"+ A[i].age);
        }

        System.out.println("Enter details of students:");
        for(int i=0;i<s;i++){
            System.out.print("Name:");
            String name = input.nextLine();
            System.out.print("Age:");
            int age = Integer.parseInt(input.nextLine());
            Student newStudent = new Student(name,age);
            B[i] = newStudent;
        }

        int max = B[0].marks;
        int min = B[0].marks;

        System.out.println("Now displaying result:");
        for(int i=0;i<s;i++){
            System.out.println("Name-> "+B[i].name+"   Marks-> "+B[i].marks);
        }
        int flag = 0;
        for(int i=0;i<s;i++) {
            if (B[i].marks>max){
                max = B[i].marks;
                flag = i;
            }
        }
        System.out.println("Student with highest marks: "+ B[flag].name);

        flag = 0;
        for(int i=0;i<s;i++) {
            if (B[i].marks<min){
                min = B[i].marks;
                flag = i;
            }
        }
        System.out.println("Student with lowest marks: "+ B[flag].name);
    }
}


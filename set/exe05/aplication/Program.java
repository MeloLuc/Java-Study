package set.exe05.aplication;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import set.exe05.entities.Course;
import set.exe05.entities.Instructor;
import set.exe05.entities.Student;

public class Program {

    public static void main(String[] args) {

        // adding/creating an instructor
        Instructor e1 = addInstructor();

        // adding class/courses to the instructor
        addCourses(e1);

        // adding Student to each course of the instructor
        System.out.println();
        for (Course c : e1.getCourses()) {
            addStudents(c);
        }


        //show how many students the chosen instructor has
        System.out.println("---------------------------");
        Set<Student> students = new HashSet<>();
        for(Course c : e1.getCourses()) {
            students.addAll(c.getStudents());
        }
        System.out.println("the instructor " + e1.getName() + " [code " + e1.getCode() + "] has " + students.size() + " Students!");
        System.out.println("They are:");
        for(Student s : students) {
            System.out.println(s);
        }

    }

    private static Instructor addInstructor() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name and code of the Instructor (ALEX XXXX): ");
        String reading = sc.nextLine();
        String[] fields = reading.split(" ");
        String name = fields[0];
        int code = Integer.parseInt(fields[1]);

        return new Instructor(code, name);
    }

    private static void addCourses(Instructor instructor) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many courses will the intructor " + instructor.getName() + " be cadastred: ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the name of " + (i + 1) + " course: ");
            String nameCourse = sc.nextLine();

            instructor.addCourse(new Course(nameCourse));

        }
    }

    private static void addStudents(Course course) {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many students will be cadastred in the " + course + ": ");
        int num = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < num; i++) {
            System.out.print("Enter the name and code of the Student (ALEX XXXX): ");
            String reading = sc.nextLine();
            String[] fields = reading.split(" ");
            String name = fields[0];
            int code = Integer.parseInt(fields[1]);

            course.addStudent(new Student(name, code));
        }
    }
}

import java.util.*;

class Student {
    private String name;
    private int grade;
    private List<String> courses;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourse() {
        System.out.println("Courses for " + name + " : ");
        for(String ok : courses) {
            System.out.println(ok);
        }
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}


public class Prob21 {
    public static void main(String[] args) {
        Student std = new Student("Hetan Nandre", 10);
        std.addCourse("Math");
        std.addCourse("Science");
        std.addCourse("English");

        std.displayCourse();

        std.removeCourse("Science");

        std.displayCourse();
    }
}

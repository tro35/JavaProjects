package GreenFoxOrganisation;

import java.util.ArrayList;


public class Cohort {
    public String name;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Mentor> mentors = new ArrayList<>();

    public Cohort(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }

    public void info() {
        System.out.println("The " + name + "cohort has" + students.size() + " students and" + mentors.size() + "mentors.");
    }
}

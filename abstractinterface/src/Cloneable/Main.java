package Cloneable;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("John", 20, "male", "BME");
        Student johnTheClone = (Student)student.clone();
        johnTheClone.introduce();
    }

}

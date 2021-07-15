package Cloneable;

public class Person {
    public String name;
    public int age;
    public String gender;


    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {
        this.name = "Jane";
        this.age = 30;
        this.gender = "female";
    }

    public void introduce() {
        System.out.println("My goal is: Live for the moment!");
    }

    public void getGoal() {
        System.out.println("Hi, I'm " + name + ", a " + age + " year old " + gender + " .");
    }

}

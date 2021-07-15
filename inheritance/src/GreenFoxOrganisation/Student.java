package GreenFoxOrganisation;


public class Student extends Person{
    private String previousOrganisation;
    private int skippedDays;


    public Student(String name, int age, String gender, String previousOrganisation) {
        super(name, age, gender);
        this.previousOrganisation = previousOrganisation;
    }

    public Student(){
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "female";
    }

    @Override
    public void getGoal() {
        System.out.println("Be a junior software developer.");
    }
    @Override
    public void introduce(){
        System.out.println("Hi, I'm "+ name +", a "+age+" year old gender from " + previousOrganisation +
                " who skipped "+ skippedDays+ " days from the course already.");
    }

    public void skipDays(int numberOFDays){
        this.skippedDays += numberOFDays;
    }
}

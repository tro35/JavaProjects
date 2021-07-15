// Write a recursive function that takes one parameter: n and
// adds numbers from 1 to n.

public class NumberAdder {
    public static void main(String[] args) {
        addNumber(10);
    }

    public static void addNumber(int number){
        if(number >= 0){
            addNumber(number - 1);
        }
        if(number >=0){
        System.out.println("Number: " + number);
        }
    }
}

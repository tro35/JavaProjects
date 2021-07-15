// Write a function that finds the largest element of an array using recursion.

public class MaximumFinder {
    public static void main(String[] args) {
        int numbers []={5,6,85,-5,8,54,87,13};
        int arrayL = numbers.length;
        System.out.println(maxFinder(numbers,arrayL));
    }

    public static int maxFinder(int[]numbers, int arrayL){
        if(arrayL <= 1)
            return numbers[0];
        return Math.max(numbers[arrayL - 1], maxFinder(numbers, arrayL - 1));
    }
}

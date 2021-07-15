// Given a non-negative integer n, return the sum of it's digits recursively
// (without loops).
//
// Hint
//
// Mod (%) by 10 yields the rightmost digit (e.g. 126 % 10 is 6)
//
// Divide (/) by 10 removes the rightmost digit (e.g. 126 / 10 is 12).

public class SumDigits {
    public static void main(String[] args) {
        int sum = sumDigits(126);
        System.out.println(sum);
    }
    public static int sumDigits(int number){

        if(number < 10){
            return number;
        }
        else {
            int lNumber = number % 10;
            return lNumber + sumDigits((number - lNumber) / 10);
        }
    }
}

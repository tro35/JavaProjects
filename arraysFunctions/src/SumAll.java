// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Print the sum of the elements of `numbers`

public class SumAll {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 5, 6, 7};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
            
        }
        System.out.println(sum);
    }
}

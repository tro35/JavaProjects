// - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
public class Reverse {
    public static void main(String[] args) {
        int [] numbers = {3,4,5,6,7};
        
        int [] numbersR = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            //System.out.println(numbers[i]);
            int c = numbers[numbers.length-1]-- ;
            System.out.println(c);
        }
    }
}
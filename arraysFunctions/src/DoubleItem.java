
// - Create an array variable named `numberList`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Double all the values in the array

public class DoubleItem {
    public static void main(String[] args) {
        int[] numberList = {3, 4, 5, 8, 5, 6};

        for (int i = 0; i < numberList.length; i++) {
            numberList[i] = numberList[i] * 2;
            System.out.println(numberList[i]);
        }
    }
}


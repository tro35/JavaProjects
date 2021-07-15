//  Create a function that takes an array of numbers as a parameter
//  and returns an array of integers where every integer is unique (occurs only once)

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findUniqueItems(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
    }

    public static int[] findUniqueItems(int array[]) {
        int resultArray[] = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] == array[j])
                    resultArray[i] += array[i];
            }

        }
        return resultArray;
    }
}



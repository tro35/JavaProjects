//  Create a function that takes a number and an array of integers as parameters
//  It returns the indices of the integers of the array which contain the given number
//  or returns an empty array (if the number is not part of any of the integers in the array)

import java.util.*;

public class SubInt {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[]{1, 11, 34, 52, 61})));
        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[]{1, 11, 34, 52, 61})));

    }

    public static int[] findMatchingIndexes(int num, int[] array) {
        int resultArray[] = new int[array.length];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == num || isDigitPresent(array[i], num)) {
                resultArray[counter] += i;
                counter++;
            }
        }
        int finalResultArray[] = new int[counter];
        for (int j = 0; j < counter; j++) {
            finalResultArray[j] = resultArray[j];
        }
        return finalResultArray;
    }

    static boolean isDigitPresent(int arrayDigits, int digitFinding) {
        // Break loop if digitFinding is present as digit
        while (arrayDigits > 0) {
            if (arrayDigits % 10 == digitFinding)
                break;
            arrayDigits = arrayDigits / 10;
        }
        // If loop broke
        return (arrayDigits > 0);
    }

}

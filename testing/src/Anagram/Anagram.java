package Anagram;

import java.util.Arrays;

public class Anagram {

    static boolean isAnagram(char input1[], char input2[]) {
        int chars = 256;

        int checkCount1[] = new int[chars];
        Arrays.fill(checkCount1, 0);
        int checkCount2[] = new int[chars];
        Arrays.fill(checkCount2, 0);

        for (int i = 0; i < input1.length && i < input2.length; i++) {
            checkCount1[input1[i]]++;
            checkCount2[input2[i]]++;
        }

        if (input1.length != input2.length) {
            return false;
        }

        for (int i = 0; i < chars; i++)
            if (checkCount1[i] != checkCount2[i])
                return false;

        return true;
    }
}

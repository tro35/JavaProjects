package Anagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class AnagramTest {
    char str1[] = ("abcde").toCharArray();
    char str2[] = ("ebcad").toCharArray();

    char str3[] = ("abtde").toCharArray();
    char str4[] = ("ebcad").toCharArray();

    Anagram anagram = new Anagram();

    @Test
    public void isAnagram(){
        assertTrue(anagram.isAnagram(str1,str2));
    }

    @Test
    public void isAnagramn(){
        assertFalse(anagram.isAnagram(str3,str4));
    }


}

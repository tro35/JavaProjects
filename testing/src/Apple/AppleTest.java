package Apple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppleTest {

    Apple apple = new Apple();

    @Test
    public void getApple(){
        String testedValue = "Apple";
        assertEquals(testedValue,apple.getApple());
    }
}
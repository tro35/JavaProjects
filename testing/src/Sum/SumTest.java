package Sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    Sum sum = new Sum();

    @Test
    public void sumList(){
        int testedValue = 100;
        assertEquals(testedValue,sum.sumList());
    }

}
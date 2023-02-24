import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    @Disabled
    void findMaximumTest1() {

        // Given an array of all positive integers
        int [] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertEquals(10, Lab.findMaximum(numbers));
    }

    @Test
    @Disabled
    void findMaximumTest2() {

        // Given an array of all negative integers
        int [] numbers = { -1, -2, -3, -4, -5, -6, -7, -8, -9, -10 };
        assertEquals(-1, Lab.findMaximum(numbers));
    }

    @Test
    @Disabled
    void findMaximumTest3() {

        // Given an array of the same number
        int [] numbers = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        assertEquals(1, Lab.findMaximum(numbers));
    }

    @Test
    @Disabled
    void findMaximumTest4() {

        // Given an array of an assortment of numbers
        int [] numbers = { 0, 100, -3, 1, 50, -32, -18, 43, 3, 98 };
        assertEquals(100, Lab.findMaximum(numbers));
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyLabTest {

    @Test
    void updateArrayTest() {

        // Given an array of integers
        int [] numbers = { 5, 10, 15, 20 };

        // Expected array of integers
        int [] expectedArray = { 10, 20, 30, 40 };

        assertArrayEquals(expectedArray, BuggyLab.updateArray(numbers));
    }
}
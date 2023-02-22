import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuggyLabTest {

    @Test
    void updateArrayTest() {

        // Given an array of integers
        int [] numbers = { 5, 10, 15, 20 };

        // Copy of numbers array to ensure the original array is not changed
        int [] numbersCopy = numbers.clone();

        // Expected array of integers
        int [] expectedArray = { 10, 20, 30, 40 };

        // Assert the expectedArray is returned when we pass the numbers array in as an argument
        assertArrayEquals(expectedArray, BuggyLab.updateArray(numbers));

        // Assert to make sure the original numbers array was not changed.
        assertArrayEquals(numbers, numbersCopy);
    }
}
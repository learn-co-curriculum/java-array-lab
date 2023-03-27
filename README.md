# Arrays Lab

## Learning Goals

- Practice using arrays in Java.
- Debugging with arrays.

## Introduction

In this lesson we will practice using arrays in Java along with debugging
code that incorporates arrays.

Fork and clone this repository. When you do, you will see 4 files called
`Lab.java`, `BuggyLab.java`, `LabTest.java`, and `BuggyLabTest.java`. The test
files will be in the `java-array-lab/src/test/java` directory. All the unit
testing will be in the test files.

## Instructions

There are two parts to this lab:

- Debugging a program by looking at its unit test.
- Taking in user input to find the maximum number in an array.

For the first part, use the `BuggyLab.java` and `BuggyLabTest.java` classes to
isolate the bug and fix the code. For the second part, use the `Lab.java` and
`LabTest.java` to write and test the code.

### Part One: Debugging

This section will focus on debugging a method in `BuggyLab`. If we look at the
documentation comments, we'll see that the method `updateArray()` is supposed to
take each element in the `int[]` and double it. The method will return an array
with the doubled values of the original array.

For example, open the unit test for `BuggyLab`:

```java
class BuggyLabTest {

  @Test
  void updateArrayTest() {

    // Given an array of integers
    int [] numbers = { 5, 10, 15, 20 };

    // Copy of numbers array to ensure the original array is not changed
    int [] numbersCopy = numbers.clone();

    // Expected array of integers
    int [] expectedArray = { 10, 20, 30, 40 };

    assertArrayEquals(expectedArray, BuggyLab.updateArray(numbers));

    // Assert to make sure the original numbers array was not changed.
    assertArrayEquals(numbers, numbersCopy);
  }
}
```

Consider the `numbers` integer array and the `expectedArray`. As we can see, the
`expectedArray` consists of the doubled values of the `numbers` array. This is
the return value we would expect from the `updateArray()` method if we were to
pass in the `numbers` array.

If we want to make sure that two arrays are equal (in that every value in each
array is equal), we need to introduce a new assertion method:
`assertArrayEquals()`. It will take in two arrays of nearly any data type to
compare.

So if we want to ensure that the array the `updateArray()` method returns is
equal to the `expectedArray`, we can pass in the `expectedArray` and the array
the `updateArray()` method returns to the `assertArrayEquals()` method!

When we run the `BuggyLabTest` unit test, we'll see that we run into the
following error:

```text
java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
```

Place some breakpoints in the program and run it with the debugger to determine
and isolate the bug. Once you have found the issue, make your changes within the
buggy program. Ensure that the unit test passes.

Notes on debugging and fixing:

- Hint: Place the breakpoint at the `for` loop and use the step-over action to
  step-through the code.
- When fixing the bug, do **not** change the `numbers` array that was passed in.
  To ensure that the `numbers` array has not been modified, note the
  `numbersCopy` variable. This is a clone or copy of the `numbers` array. After
  the `updateArray()` method has been called, we'll also assert to make sure the
  `numbers` array has not been changed.
- **Do not modify the `BuggyLabTest.java` file.**

### Part Two: Find the Maximum

In this section, take in user input to fill an array and then find the maximum
number in the array.

- In the `main()` method:
  - Prompt the user 10 times for an integer to fill an array.
    - Hint: The array will have a size of 10. Make sure you only allow the user to
      enter in 10 integers.
  - Call the `findMaximum()` method and pass in the array of user input.
  - Print the return value of the `findMaximum()` method to the console.
- In the `findMaximum()` method:
  - Use an algorithm similar to the `findMinimum()` method we saw in the
    previous lesson.
  - Return the maximum value within the array.
- To help you, consider the unit test cases in the `LabTest.java` file.
  - There are four different test cases.
  - To run them, comment out or remove the `@Disabled` annotation. This
    annotation tells JUnit not to run the test.
  - Make sure all four of these test cases pass before submitting your
    assignment.

Run the program after you finished completing the above instructions. It is
advised you test out this program a few times to ensure that all options are
running correctly.

You may also run the program with the IntelliJ debugger, or you can use the
Java Visualizer.

## Expected Output

The expected output below is a possible output for the `Lab.java`:

```text
Enter a number:
-100
Enter a number:
-8
Enter a number:
0
Enter a number:
10
Enter a number:
9
Enter a number:
52
Enter a number:
28
Enter a number:
47
Enter a number:
47
Enter a number:
18
The maximum value is 52
```

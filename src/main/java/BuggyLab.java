public class BuggyLab {

    /**
     * Take in an array of integers and double each value in the array.
     * @param numbers : int[] - array of integers we want to double
     * @return int[] - new array with the values of the original doubled.
     */
    public static int[] updateArray(int[] numbers) {
        int [] doubledArray = new int[numbers.length];

        for (int index = 1; index <= numbers.length; index++) {
            doubledArray[index] = numbers[index] * 2;
        }

        return doubledArray;
    }
}

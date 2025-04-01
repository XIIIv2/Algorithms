package app;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Main {

    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        int[] unsortedArray = new DataProvider().getData();
        int[] sortedArray = arrayUtils.mergeSort(unsortedArray);

        System.out.println("Unsorted array: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted array: " + Arrays.toString(sortedArray));

        try {
            int target = 7;
            int position = arrayUtils.binarySearch(sortedArray, target);
            int value = sortedArray[position];
            System.out.printf("Search element (%d) in %s: position %d, value %d%n", target, Arrays.toString(sortedArray), position, value);
        } catch (NoSuchElementException e) {
            System.out.println(e.getMessage());
        }
    }

}

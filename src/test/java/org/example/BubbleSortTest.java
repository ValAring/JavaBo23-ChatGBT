package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BubbleSortTest {

    @Test
    public void testBubbleSort() {
        int[] inputArray = {5, 2, 9, 1, 5, 6};
        int[] expectedArray = {1, 2, 5, 5, 6, 9};
        BubbleSort.bubbleSort(inputArray);
        assertArrayEquals(expectedArray, inputArray);
    }

    /*@Test
    public void testSwap() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int[] expectedArray = {5, 9, 2, 1, 5, 6};
        BubbleSort.swap(array, 1, 2);
        assertArrayEquals(expectedArray, array);
    }*/
}

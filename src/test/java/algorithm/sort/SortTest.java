package algorithm.sort;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SortTest {
    
    @Test
    public void testSelectionSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        SelectionSort.selectionSort(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testBubbleSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        BubbleSort.bubbleSort(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testBubbleSortWithFlag() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        BubbleSort.bubbleSortWithFlag(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testInsertionSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        InsertionSort.insertionSort(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testQuickSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        QuickSort.quickSort(nums, 0, nums.length - 1);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }
}

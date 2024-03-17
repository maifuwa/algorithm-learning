package algorithm.sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

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

    @Test
    public void testMergeSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        MergeSort.mergeSort(nums, 0, nums.length - 1);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testHeapSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        HeapSort.heapSort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }

    @Test
    public void testBucketSort() {
        double[] nums = {0.52, 0.2, 0.92, 0.12, 0.51, 0.62};
        BucketSort.bucketSort(nums);
        assertArrayEquals(nums, new double[]{0.12, 0.2, 0.51, 0.52, 0.62, 0.92}, 0.0001);
    }

    @Test
    public void testCountingSortNaive() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        CountingSort.countingSortNaive(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testCountingSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        CountingSort.countingSort(nums);
        assertArrayEquals(Arrays.toString(nums), nums, new int[]{1, 2, 5, 5, 6, 9});
    }

    @Test
    public void testRadixSort() {
        int[] nums = {5, 2, 9, 1, 5, 6};
        RadixSort.radixSort(nums);
        assertArrayEquals(nums, new int[]{1, 2, 5, 5, 6, 9});
    }
}

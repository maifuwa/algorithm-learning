package algorithm.search;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;

        int resultLIRER = BinarySearch.LIRERBinarySearch(nums, target);
        int resultClosed = BinarySearch.ClosedIntervalBinarySearch(nums, target);

        assertTrue(resultLIRER == 4);
        assumeTrue(resultClosed == 4);
    }

    @Test
    public void testbinarySearchInsertion() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;
        
        int resultSimple = BinarySearch.binarySearchInsertionSimple(nums, target);
        int resultWithDuplicates = BinarySearch.binarySearchInsertionWithDuplicate(nums, target);

        assertTrue(resultSimple == 4);
        assumeTrue(resultWithDuplicates == 4);
    }

    @Test
    public void testbinarySearchEdge() {
        int[] nums = { 1, 2, 3, 4, 5, 5, 5, 6, 7, 8, 9 };
        int target = 5;
        
        int resultLeft = BinarySearch.binarySearchLeftEdge(nums, target);
        int resultRight = BinarySearch.binarySearchRightEdge(nums, target);

        assertTrue(resultLeft == 4);
        assumeTrue(resultRight == 6);
    }

}

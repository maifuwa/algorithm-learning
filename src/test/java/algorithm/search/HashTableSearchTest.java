package algorithm.search;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class HashTableSearchTest {
    
    @Test
    public void testHashTableSearch() {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 5;

        int[] result = HashTableSearch.hashTableSearch(nums, target);

        assertTrue(Arrays.toString(result), nums[result[0]] + nums[result[1]] == target);
    }
}

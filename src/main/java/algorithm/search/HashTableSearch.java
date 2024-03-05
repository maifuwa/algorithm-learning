package algorithm.search;

import java.util.HashMap;
import java.util.Map;

/**
 * 哈希搜索
 * 
 * 以空间换时间 时间复杂度O(n) 空间复杂度O(n)
 */
public class HashTableSearch {

    /*
     * 给定一个整数数组nums和一个目标元素target，请在数组中搜索“和”为 target 的两个元素，并返回它们的数组索引。返回任意一个解即可。
     */

    public static int[] hashTableSearch(int[] nums, int target) {
        Map<Integer, Integer> dic = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            if (dic.containsKey(target - nums[i])) {
                return new int[] {i, dic.get(target - nums[i])};
            }else {
                dic.put(nums[i], i);
            }
        }

        return new int[] {};
    }
}

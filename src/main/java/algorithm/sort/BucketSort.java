package algorithm.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 桶排序
 * 
 * 分治思想将原数组分为k个桶，每个桶内的元素分别排序，然后将所有桶内的元素按顺序合并
 * 时间复杂度O(n + k) 当桶数量较大是趋向于O(n)
 * 空间复杂度O(n + k) 
 * 自适应、非原地、是否稳定取决于桶内排序算法
 */
public class BucketSort {
    
    public static void bucketSort(double[] nums) {
        int k = nums.length / 2;
        List<List<Double>> buckets = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            buckets.add(new ArrayList<>());
        }
        for (double num : nums) {
            int i = (int)num * k;   // 注意：这里原题规定 0 <= nums[i] < 1
            buckets.get(i).add(num);
        }

        for (List<Double> bucket : buckets) {
            Collections.sort(bucket);
        }

        int i = 0;
        for (List<Double> bucket : buckets) {
            for (double num : bucket) {
                nums[i++] = num;
            }
        }
    }


}

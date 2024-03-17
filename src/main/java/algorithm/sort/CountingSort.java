package algorithm.sort;

import java.util.Arrays;

/**
 * 计数排序
 * 
 * 通过统计元素数量来实现排序，通常应用于整数数组。
 * 时间复杂度：O(n + m)，空间复杂度：O(n + m)、非原地、稳定
 * 局限：计数排序只适用于非负整数，计数排序适用于数据量大但数据范围较小的情况
 */
public class CountingSort {
    
    // 简单实现，无法用于排序对象
    public static void countingSortNaive(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        int[] temp = new int[max + 1];

        for (int i = 0; i < nums.length; i++) {
            temp[nums[i]] ++; 
        }

        int k = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != 0) {
                while (temp[i] > 0) {
                    nums[k++] = i;
                    temp[i] --;
                }
            }
        }
    }

    // 完整实现，可排序对象，稳定排序
    public static void countingSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        int[] count = new int[max + 1];

        Arrays.stream(nums).forEach(num -> {
            count[num] ++;
        });

        // 计算 count 的前缀和，将出现次数转换为 尾索引（count[num] - 1 是 num 在 res 中最后一次出现的索引）
        for (int i = 0; i < count.length - 1; i++) {
            count[i + 1] += count[i];
        }

        // 倒序遍历 nums 将结果填入 res 
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            res[count[num] - 1] = num;
            count[num] --;
        }

        System.arraycopy(res, 0, nums, 0, nums.length);
    }
}

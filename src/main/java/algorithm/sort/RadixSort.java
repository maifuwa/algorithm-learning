package algorithm.sort;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 基数排序
 * 
 * 核心思想与计数排序一致，也通过统计个数来实现排序。基数排序利用数字各位之间的递进关系，依次对每一位进行排序，从而得到最终的排序结果。
 * 时间复杂度：O(nk)，空间复杂度：O(n + d)，非原地、稳定
 * 局限：数据必须可以表示为固定位数的格式，且位数不能过大
 */
public class RadixSort {

    public static void radixSort(int[] nums) {
        int max = Arrays.stream(nums).max().getAsInt();
        for (int exp = 1; exp <= max; exp *= 10) {
            countingSortDigit(nums, exp);
        }
    }


    private static void countingSortDigit(int[] nums, int exp) {
        int[] count = new int[10];
        Arrays.stream(nums).forEach(num -> {
            int d = digit(num, exp);
            count[d] ++;
        });

        IntStream.range(1, count.length).forEach(i -> {
            count[i] += count[i-1];
        });

        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            int d = digit(nums[i], exp);
            res[count[d] - 1] = nums[i];
            count[d] --;
        }

        System.arraycopy(res, 0, nums, 0, nums.length);
    }

    private static int digit(int num, int exp) {
        return (num / exp) % 10;
    }    
}

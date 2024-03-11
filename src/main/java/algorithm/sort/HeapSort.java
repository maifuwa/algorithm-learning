package algorithm.sort;

/**
 * 堆排序
 * 
 * 不是很懂...
 * 时间复杂度O(nlogn) 空间复杂度O(1) 非自适应 原地排序 非稳定
 */
public class HeapSort {
    
    public static void heapSort(int[] nums) {
        // 建堆操作
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            siftDown(nums, nums.length, i);
        }

        // 从堆中提取最大元素
        for (int i = nums.length - 1; i > 0; i--) {
            int temp = nums[0];
            nums[0] = nums[i];
            nums[i] = temp;

            siftDown(nums, i, 0);
        }
    }

    private static void siftDown(int[] nums, int n, int i) {
        while (true) {
            int l = 2 * i + 1, r = 2 * i + 2, max = i;
            if (l < n && nums[l] > nums[max]) {
                max = l;
            }
            if (r < n && nums[r] > nums[max]) {
                max = r;
            }
            if (max == i) {
                break;
            }

            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;

            i = max;
        }
    }
}

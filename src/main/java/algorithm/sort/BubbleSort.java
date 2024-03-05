package algorithm.sort;

/**
 * 冒泡排序
 * 
 * 通过连续地比较与交换相邻元素实现排序，每轮将最大的元素放到末尾。
 * 时间复杂度: O(n^2)、空间复杂度: O(1)、自适应、稳定、原地排序
 */
public class BubbleSort {
    
    public static void bubbleSort(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    // 优化：如果某一轮没有发生交换，说明数组已经有序，直接退出
    public static void bubbleSortWithFlag(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            boolean flag = false;
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    flag = true;
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
            if (!flag) break;
        }
    }
}

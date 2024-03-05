package algorithm.sort;

/**
 * 选择排序
 * 
 * 开启一个循环，每轮从未排序区间选择最小的元素，将其放到已排序区间的末尾。
 * 时间复杂度: O(n^2)、空间复杂度: O(1)、非自适应、非稳定、原地排序
 */
public class SelectionSort {
    
    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int k = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[k]) {
                    k = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
    }
}

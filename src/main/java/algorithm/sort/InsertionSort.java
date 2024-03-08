package algorithm.sort;

/**
 * 插入排序
 * 
 * 在未排序区间选择一个基准元素，将该元素与其左侧已排序区间的元素逐一比较大小，
 * 并将该元素插入到正确的位置。
 * 时间复杂度: O(n^2)、空间复杂度: O(1)、稳定、原地、自适应排序
 * 
 * 比冒泡和选择排序使用多，因为操作单元少和稳定
 */
public class InsertionSort {
    
    public static void insertionSort(int[] nums) {
        
        for (int i = 1; i < nums.length; i++) {
            int base = nums[i], j = i - 1;
            while (j >=0 && nums[j] > base) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = base;
        }
    }
}

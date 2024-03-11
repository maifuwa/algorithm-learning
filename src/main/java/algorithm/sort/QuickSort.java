package algorithm.sort;

/**
 * 快速排序
 * 
 * 基于分治策略,核心操作是“哨兵划分”，其目标是：选择数组中的某个元素作为“基准数”，
 * 将所有小于基准数的元素移到其左侧，而大于基准数的元素移到其右侧。
 * 时间复杂度：O(nlogn) 空间复杂度：O(n) 自适应 原地排序 不稳定
 */
public class QuickSort {

    public static void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int pivot = partition(nums, left, right);
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
    }

    /*
     * 哨兵划分
     * 哨兵划分的实质是将一个较长数组的排序问题简化为两个较短数组的排序问题
     */
    private static int partition(int[] nums, int left, int right) {
        int i = left, j = right;
        while (i < j) {
            while (i < j && nums[j] >= nums[left]) j--;
            while (i < j && nums[i] <= nums[left]) i++;
            swap(nums, i, j);
        }
        swap(nums, i, left);
        return i;
    }

        /*
     * 交换数组中两个元素
     */
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}

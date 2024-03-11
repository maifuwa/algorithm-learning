package algorithm.sort;

/**
 * 归并排序
 * 
 * 基于分治策略，分为划分阶段和合并阶段。
 * 主要是两个问题：将长数组的排序问题转为短数组的排序问题，两个有序数组的合并问题
 * 时间复杂度 O(nlogn) 空间复杂度O(n) 非自适应 非原地排序 稳定
 */
public class MergeSort {
    
    public static void mergeSort(int[] nums, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) >> 1;
        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);
        merge(nums, left, mid, right);
    }


    private static void merge(int[] nums, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0;
        while (i <= mid && j <= right) {
            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            }else {
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= right) {
            temp[k++] = nums[j++];
        }

        while (--k >= 0) {
            nums[left + k] = temp[k];
        }
    }
}

package algorithm.search;

/**
 * 二分搜索
 * 
 * 注意：区间选择决定边界条件和right取值
 * 优点：1.二分查找的时间效率高。在大数据量下，对数阶的时间复杂度具有显著优势。
 * 2.二分查找无须额外空间。
 * 局限性：1.二分查找仅适用于有序数据。2.二分查找仅适用于数组。二分查找需要跳跃式（非连续地）
 * 访问元素，而在链表中执行跳跃式访问的效率较低，因此不适合应用在链表或基于链表实现的数据结构。
 * 3.小数据量下，线性查找性能更佳。
 */
public class BinarySearch {

    /*
     * 问题： 给定一个有序数组nums，元素按从小到大的顺序排列且不重复。请查找并返回元素target在该数组中的索引。
     * 若数组不包含该元素，则返回 -1。
     */

    // 左闭右开 [left, right)
    public static int LIRERBinarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int left = 0, right = nums.length;
        while (left < right) {
            int m = left + (right - left) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                left = m + 1;
            } else {
                right = m;
            }
        }

        return -1;
    }

    // 双闭区间 [left, right] 一般建议使用双闭区间
    public static int ClosedIntervalBinarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int m = left + (right - left) / 2;
            if (nums[m] == target) {
                return m;
            } else if (nums[m] < target) {
                left = m + 1;
            } else {
                right = m - 1;
            }
        }

        return -1;
    }

  
    /*
     * 给定一个有序数组nums和一个元素target，数组不存在重复元素。现将target插入数组nums中，并保持其有序性。
     * 若数组中已存在元素target，则插入到其左方。请返回插入后 target 在数组中的索引。
     */

    // 左开右闭区间 不存在重复元素
    public static int binarySearchInsertionSimple(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int k = l + (r - l) / 2;
            if (nums[k] == target) {
                return k;
            } else if (nums[k] < target) {
                l = k + 1;
            } else {
                r = k;
            }
        }

        return l;
    }

    // 双闭区间 存在重复元素
    public static int binarySearchInsertionWithDuplicate(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int k = l + (r - l) / 2;
            if (nums[k] < target) {
                l = k + 1;
            } else {
                r = k - 1;
            }
        }

        return l;
    }

    /*
     * 给定一个有序数组nums，其中可能包含重复元素。请返回数组中最左一个元素target的索引。若数组中不包含该元素，则返回 -1。
     */

     // 查找左边界
     public static int binarySearchLeftEdge(int[] nums, int target) {
        int i = binarySearchInsertionWithDuplicate(nums, target);

        if (i == nums.length || nums[i] != target ) {
            return -1;
        }

        return i;
     }

     // 查找右边界  
     // 这里因为target是int,所以target+1就是最小的大于target的数，只需要找到target+1的位置，然后-1即可
     public static int binarySearchRightEdge(int[] nums, int target) {
        int i = binarySearchInsertionWithDuplicate(nums, target + 1);

        if (i - 1 < 0 || nums[i - 1] != target) {
            return - 1;
        }

        return i - 1;
     }

     

}

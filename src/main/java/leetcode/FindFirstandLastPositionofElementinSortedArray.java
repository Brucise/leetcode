package leetcode;

import jdk.internal.org.objectweb.asm.tree.LineNumberNode;

import java.util.Stack;

/**
 * @author: chenhuang
 * @date: 2019/3/13
 * @description:
 */
public class FindFirstandLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[2];
        result[0] = -1;
        result[1] = -1;
        if (nums.length == 0) {
            return result;
        }

        int left, right, start, end;
        start = end = -1;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                /*往左走找第一个，往右走找第二个*/
                start = end = mid;
                while (start >= left && nums[start] == nums[mid]) {
                    start--;
                }
                while (end <= right && nums[end] == nums[mid]) {
                    end++;
                }
                start++;
                end--;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        result[0] = start;
        result[1] = end;
        return result;
    }

    public static void main(String[] args) {
        FindFirstandLastPositionofElementinSortedArray array = new FindFirstandLastPositionofElementinSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        array.searchRange(nums, 6);
    }
}

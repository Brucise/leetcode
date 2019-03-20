package leetcode;

import java.util.logging.Level;

/**
 * @author: chenhuang
 * @date: 2019/3/13
 * @description:
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        int left, right, mid, result;
        left = 0;
        right = nums.length - 1;
        result = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
                result = left;
            } else {
                right = mid - 1;
                result = right + 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6, 8};
        int[] nums1 = {};
        System.out.println(searchInsertPosition.searchInsert(nums, 7));
//        System.out.println(searchInsertPosition.searchInsert(nums1, 2) == 0);
//        System.out.println(searchInsertPosition.searchInsert(nums, 5) == 1);
//        System.out.println(searchInsertPosition.searchInsert(nums, 8) == 1);
//        System.out.println(searchInsertPosition.searchInsert(nums, 0) == 0);
    }
}

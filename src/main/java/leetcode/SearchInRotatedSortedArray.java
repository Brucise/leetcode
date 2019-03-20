package leetcode;


import java.util.Random;
import java.util.UnknownFormatConversionException;
import java.util.logging.Level;

/**
 * @author: chenhuang
 * @date: 2019/3/12
 * @description:
 */
public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int left, right;
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < nums[right]) {
                if (nums[mid] < target && nums[right] > target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            } else {
                if (nums[mid] > target && nums[left] < target) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
//            } else if (nums[left] < target && nums[mid] > nums[right]) {
//                right = mid - 1;
//            } else if (nums[right] > target && nums[mid] < nums[right]) {
//                left = mid + 1;
//            }
        }
        return -1;
    }


    public static void main(String[] args) {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
//        int[] nums = {5, 1, 3};
        System.out.println(searchInRotatedSortedArray.search(nums, 1));
    }
}

package leetcode;

/**
 * @author: chenhuang
 * @date: 2019/3/11
 * @description:
 */
public class MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        double median;
        int p = 0;
        int q = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (p < nums1.length && q < nums2.length) {
                if (nums1[p] < nums2[q]) {
                    nums[index++] = nums1[p++];
                } else if (nums1[p] > nums2[q]) {
                    nums[index++] = nums2[q++];
                } else {
                    nums[index++] = nums1[p++];
                    nums[index++] = nums2[q++];
                }
            } else if (p < nums1.length && q >= nums2.length) {
                nums[index++] = nums1[p++];
            }else if (p >= nums1.length && q < nums2.length){
                nums[index++] = nums2[q++];
            }
        }
        median = nums.length % 2 == 0 ? ((double) nums[nums.length / 2] +(double) nums[nums.length / 2 - 1]) / 2 : nums[nums.length / 2];
        return median;
    }

    public static void main(String[] args) {
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        int[] nums1 = {1};
        int[] nums2 = {};
        medianofTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
    }
}

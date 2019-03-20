package leetcode;

import sun.awt.geom.AreaOp;

import java.util.Comparator;
import java.util.TreeMap;

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
            } else if (p >= nums1.length && q < nums2.length) {
                nums[index++] = nums2[q++];
            }
        }
        median = nums.length % 2 == 0 ? ((double) nums[nums.length / 2] + (double) nums[nums.length / 2 - 1]) / 2 : nums[nums.length / 2];
        return median;
    }

    public double findMedianSortedArraysV2(int[] nums1, int[] nums2) {
        Comparator<Integer> integerComparator = (Integer o1, Integer o2) -> {
            if (o1-o2!=0){
                return o1-o2;
            }else {
                return 1;
            }
        };
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int i : nums1) {
            treeMap.put(-i, i);
        }
        for (int i : nums2) {
            treeMap.put(i, i);
        }
        double median = ((double) treeMap.firstKey() + (double) treeMap.lastKey()) / 2;
        return median;
    }

    public static void main(String[] args) {
        MedianofTwoSortedArrays medianofTwoSortedArrays = new MedianofTwoSortedArrays();
        int[] nums1 = {1,2,3};
        int[] nums2 = {2,4};
        double medianSortedArrays = medianofTwoSortedArrays.findMedianSortedArrays(nums1, nums2);
        double medianSortedArraysV2 = medianofTwoSortedArrays.findMedianSortedArraysV2(nums1, nums2);
        System.out.println(medianSortedArrays == medianSortedArraysV2);
    }
}

package interview;

/**
 * @author: chenhuang
 * @date: 2019/3/19
 * @description:
 */
public class TwoMatrix {
    public static boolean Find(int target, int[][] array) {
        for (int i = 0; i<array.length;i++){
            if(array[i].length==0){
                continue;
            }
            if (array[i][0] <= target && target <= array[i][array[i].length - 1]) {
                return helper(array[i], target);
            }
        }
        return false;
    }

    public static boolean helper(int[] n, int target) {
        int start, end, mid;
        start = 0;
        end = n.length - 1;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (n[mid] > target) {
                end = mid - 1;
            } else if (n[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int[][] n= {{}};
        Find(16,n);
    }
}

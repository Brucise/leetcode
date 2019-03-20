package leetcode;

import java.util.Arrays;

/**
 * @author: chenhuang
 * @date: 2019/3/15
 * @description:
 */
public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length > 0 && target >= matrix[i][0]) {
                int i1 = Arrays.binarySearch(matrix[i], target);
                if (i1 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Search2DMatrix search2DMatrix = new Search2DMatrix();
//        int[][] matrix = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}};
        int[][] matrix = {{1}};
        System.out.println(search2DMatrix.searchMatrix(matrix, 1));
    }
}

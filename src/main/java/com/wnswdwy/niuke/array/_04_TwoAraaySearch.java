package com.wnswdwy.niuke.array;

/**
 * @author yycstart
 * @create 2021-01-29 12:08
 *
 *      4. 二维数组中的查找
 * 链接：https://www.nowcoder.com/discuss/198840
 * 题目描述
 * 给定一个二维数组，其每一行从左到右递增排序，从上到下也是递增排序。给定一个数，判断这个数是否在该二维数组中。
 *
 * Consider the following matrix:
 * [
 *   [1,   4,  7, 11, 15],
 *   [2,   5,  8, 12, 19],
 *   [3,   6,  9, 16, 22],
 *   [10, 13, 14, 17, 24],
 *   [18, 21, 23, 26, 30]
 * ]
 *
 * Given target = 5, return true.
 * Given target = 20, return false.
 */
public class _04_TwoAraaySearch {
    public static void main(String[] args) {
        int[][] num = {
                {1,  4,  7,  11, 15},
                {2,  5,  8,  12, 19},
                {3,  6,  9,  16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        boolean isInNum = isIn(27, num);
        System.out.println(isInNum);
    }

    public static boolean isIn(int target,int[][] matrix){



        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return false;
        int rows = matrix.length, cols = matrix[0].length;
        int r = 0, c = cols - 1; // 从右上角开始
        while (r <= rows - 1 && c >= 0) {
            if (target == matrix[r][c])
                return true;
            else if (target > matrix[r][c])
                r++;
            else
                c--;
        }
        return false;
    }


}

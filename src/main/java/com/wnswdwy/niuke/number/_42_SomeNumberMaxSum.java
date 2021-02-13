package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-13 12:45
 *      42. 连续子数组的最大和
 *          题目描述
 *          {6, -3, -2, 7, -15, 1, 2, 2}，连续子数组的最大和为 8（从第 0 个开始，到第 3 个为止）。
 */
public class _42_SomeNumberMaxSum {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int great = Integer.MIN_VALUE;
        for(int m : nums){
            sum = sum <= 0 ? m:m+sum;
            great = Math.max(sum,great);
        }
        return great;
    }
}

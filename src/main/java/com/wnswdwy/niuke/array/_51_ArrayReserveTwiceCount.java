package com.wnswdwy.niuke.array;

/**
 * @author yycstart
 * @create 2021-02-18 13:23
 *      51. 数组中的逆序对
 *          NowCoder
 *
 *          题目描述
 *      在数组中的两个数字，如果前面一个数字大于后面的数字，
 *      则这两个数字组成一个逆序对。输入一个数组，求出这个数组中的逆序对的总数。
 */
public class _51_ArrayReserveTwiceCount {

    //穷举方法，时间复杂度高
    public int reversePairs(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++ )
            for(int j = nums.length - 1; j > i; j --)
                if(nums[i] > nums[j])
                    sum++;
        return sum;
    }
}

package com.wnswdwy.niuke.array;

/**
 * @author yycstart
 * @create 2021-02-01 12:47
 *   21. 调整数组中元素位置，奇数在前，偶数在后
 *      输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *      所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _21_ExchangeOuShuJiShuWeiZhi_1 {

    public int[] exchange(int[] nums) {
        int l = 0,r = nums.length - 1;

        while(l < r){
            while(l < r && nums[l] % 2 == 1)
                l ++;
            while(l < r && nums[r] % 2 == 0)
                r --;

            if(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
        }
        return nums;
    }
}

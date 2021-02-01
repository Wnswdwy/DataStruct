package com.wnswdwy.niuke.array;

/**
 * @author yycstart
 * @create 2021-02-01 12:47
 *   21. 调整数组中元素位置，奇数在前，偶数在后
 *   方案2：
 *      输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，
 *      所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class _21_ExchangeOuShuJiShuWeiZhi_2 {

    public int[] exchange(int[] nums) {
        int oddCount = 0;
        for (int num : nums) {
            if(num % 2 == 1){
                oddCount++;
            }
        }

        int i = 0;
        int j = oddCount;

        int[] m = nums.clone();
        for (int temp : m) {
            if(temp % 2 == 1){
                nums[i++] = temp;
            }else {
                nums[j++] = temp;
            }
        }
        return nums;
    }
}

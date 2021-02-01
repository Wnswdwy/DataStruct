package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-01 9:33
 *
 *      15. 求一个二进制数中 1 的个数
 *     n & (n - 1)  每执行一次，二进制数中最右边的 1 变成0
 */
public class _15_NumberOneCount {

    public int NumberOf1(int n) {
        //需要考虑负数情况、
        int count = 0;
        while(n != 0){
            count ++;
            n = n & (n - 1);
        }
        return count;
    }
}

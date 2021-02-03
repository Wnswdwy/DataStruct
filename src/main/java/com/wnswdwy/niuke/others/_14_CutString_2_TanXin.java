package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-02 15:09
 *      14. 剪绳子
 *      将长度为 n 的绳子，剪切成 m 段，m>0,n>0,使其乘积最大，最大乘积为多少？
 *
 *      解法二：贪心算法
 *
 */
public class _14_CutString_2_TanXin {

    public int cutRope(int n) {
//        if(n < 2) return 0;
//        if(n == 2) return 1;
//        if(n == 3) return 2;
//        int threeCount = n / 3;
//
//        if(( n - 3*threeCount ) == 1) threeCount--;
//
//        int twoCount = (n - threeCount * 3) / 2;
//
//        int Count = (int)Math.pow(3,threeCount) * (int)Math.pow(2,twoCount);
//
//        return Count;

        if( n <= 3) return n - 1;
        if( n == 4) return n;

        int res = 1;
        while(n > 4){
            res *= 3;
            n -= 3;
        }

        return res * n;

    }
}

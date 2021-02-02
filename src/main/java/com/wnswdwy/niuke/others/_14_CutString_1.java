package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-02 15:09
 *      14. 剪绳子
 *      将长度为 n 的绳子，剪切成 m 段，m>0,n>0,使其乘积最大，最大乘积为多少？
 */
public class _14_CutString_1 {

    public int cutRope(int n) {
        if(n < 2) return 0;
        int[]dp = new int[n + 1];
        dp[1] = 1;

        for(int i = 2; i <= n; i++ ){
            for(int j = 1;j < i; j++){
                dp[i] = Math.max(dp[i], Math.max(j * (i - j), dp[j] * (i - j)));
            }
        }
        return dp[n];
    }
}

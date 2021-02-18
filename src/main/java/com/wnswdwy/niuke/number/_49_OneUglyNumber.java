package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-18 11:53
 *
        49. 丑数
        NowCoder

        题目描述
        把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。例如 6、8 都是丑数，
    但 14 不是，因为它包含因子 7。习惯上我们把 1 当做是第一个丑数。求按从小到大的顺序的第 N 个丑数。
*/
public class _49_OneUglyNumber {

    public int nthUglyNumber(int n) {
        int[] num = new int[n];
        int p2 = 0,p3 = 0,p5 = 0;
        if(n <= 6) return n;
        num[0] = 1;
        for(int i = 1;i < n;i++){
            int next2 = num[p2] * 2, next3 = num[p3] * 3, next5 = num[p5] * 5;
            num[i] = Math.min(next2,Math.min(next3,next5));
            if(num[i] == next2) p2++;
            if(num[i] == next3) p3++;
            if(num[i] == next5) p5++;
        }
        return num[n - 1];
    }
}

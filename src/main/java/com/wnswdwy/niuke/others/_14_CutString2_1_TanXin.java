package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-03 11:42
 */
public class _14_CutString2_1_TanXin {


    public int cuttingRope(int n) {
        if(n <= 3)
            return n - 1;

        long res = 1;
        int p = 1000000007;

        if(n % 3 == 1){
            res *= 4;
            res %= p;
            n -= 4;
        }else if(n % 3 == 2){
            res *=  2;
            res %= p;
            n -= 2;
        }
        while(n != 0){
            res *= 3;
            res %= p;
            n -= 3;
        }
        return (int)res % p;
    }
}

package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-01 11:29
 *      16. 求一个数的n次幂qi
 *
 *      方案1 ： 快速次幂求解
 */
public class _16_OneNumberNCiFang_1 {

    public double Power(double base, int exponent) {
        if( base == 0) return 0;

        long b = exponent;

        double res = 1.0;
        if(b < 0){
            b = -b;
            base = 1/base;
        }

        while(b > 0){
            if((b & 1 )== 1){
                res *= base;  //累乘
            }
            base *= base; //2的次方
            b >>= 1;
        }
        return res;
    }
}

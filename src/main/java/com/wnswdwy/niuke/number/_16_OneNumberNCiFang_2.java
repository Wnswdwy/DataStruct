package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-01 11:29
 *      16. 求一个数的n次幂
 *  方案2 ： x的n次幂变形如下：
 *       x的n次幂 = {
 *                   (x∗x) 的 n/2 次幂          n % 2 = 0
 *                   x * ((x∗x) 的 n/2 次幂)    n % 2 = 1
 *                 }
 */
public class _16_OneNumberNCiFang_2 {

    public double Power(double base, int exponent) {
        if(exponent == 0)
            return 1;
        if(exponent == 1)
            return base;

        boolean isTrue = false;
        if(exponent < 0){
            exponent = - exponent;
            isTrue = true;
        }
        double pow = Power(base * base ,exponent / 2);
        if(exponent %2 != 0)
            pow = pow * base;
        return isTrue ? 1 / pow : pow;
    }
}

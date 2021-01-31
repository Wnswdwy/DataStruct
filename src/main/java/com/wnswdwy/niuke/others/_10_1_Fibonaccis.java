package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-01-31 14:36
 *      10.1 斐波那契数列
 *      f(n) = 0                   n = 0
 *             1                   n = 1
 *             F(n-1) + F(n - 2)   n > 1
 *
 */
public class _10_1_Fibonaccis {
    public int Fibonacci(int n) {
        int sum = 0;
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }else{
            sum =  Fibonacci(n-1) + Fibonacci(n-2);
        }
        return sum;
    }
}

package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-03 11:59
 *
 * 17. 打印从 1 到最大的 n 位数
 * 题目描述
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。
 * 比如输入 3，则打印出 1、2、3 一直到最大的 3 位数即 999。
 */
public class _17_PrintZeroToMaxNumber {

    public int[] printNumbers(int n) {
        int count = (int)Math.pow(10,n) - 1;
        int [] number = new int[count];
        for(int i = 0; i < count ;i++){
            number[i] = i + 1;
        }

        return number;
    }
}

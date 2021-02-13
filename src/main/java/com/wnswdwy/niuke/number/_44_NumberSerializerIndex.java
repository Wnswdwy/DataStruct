package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-13 13:20
 *      44. 数字序列中的某一位数字
 * 题目描述
 * 数字以 0123456789101112131415... 的格式序列化到一个字符串中，求这个字符串的第 index 位。
 */
public class _44_NumberSerializerIndex {

    /* 数字范围    数量  位数    占多少位
    1-9        9      1       9
    10-99      90     2       180
    100-999    900    3       2700
    1000-9999  9000   4       36000  ...

    例如 2901 = 9 + 180 + 2700 + 12 即一定是4位数,第12位   n = 12;
    数据为 = 1000 + (12 - 1)/ 4  = 1000 + 2 = 1002
    定位1002中的位置 = (n - 1) %  4 = 3    s.charAt(3) = 2;
*/

        public int findNthDigit(int n) {
            int digit = 1;   // n所在数字的位数
            long start = 1;  // 数字范围开始的第一个数
            long count = 9;  // 占多少位
            while(n > count){
                n -= count;
                digit++;
                start *= 10;
                count = digit * start * 9;
            }
            long num = start + (n - 1) / digit;
            return Long.toString(num).charAt((n - 1) % digit) - '0';
        }

}

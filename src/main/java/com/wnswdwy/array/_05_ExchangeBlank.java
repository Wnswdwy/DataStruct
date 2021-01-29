package com.wnswdwy.array;

import java.util.Arrays;

/**
 * @author yycstart
 * @create 2021-01-29 12:49
 *
 *      5. 替换空格
 *
 * 题目描述
 * 将一个字符串中的空格替换成 "%20"。
 * Input:
 * "A B"
 *
 * Output:
 * "A%20B"
 */
public class _05_ExchangeBlank {
    public static void main(String[] args) {
        String Str = "A  B";
        String newStr = "";

        for (int i = 0; i < Str.length(); i++) {
            char temp = Str.charAt(i);
            if(temp == ' '){
                newStr += "%20";
            }else {
                newStr += temp;
            }
        }

        System.out.println(newStr);
    }
}

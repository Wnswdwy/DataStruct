package com.wnswdwy.niuke.number;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yycstart
 * @create 2021-02-13 12:04
 *      41.2 字符流中第一个不重复的字符
 *      NowCoder
 *
 *      题目描述
 *      请实现一个函数用来找出字符流中第一个只出现一次的字符。
 *      例如，当从字符流中只读出前两个字符 "go" 时，第一个只出现一次的字符是 "g"。
 *      当从该字符流中读出前六个字符“google" 时，第一个只出现一次的字符是 "l"
 */
public class _41_2_CharStreamingFirstNoAgainChar {


    public int FirstNotRepeatingChar(String str) {
        Map<Character,Boolean> first = new HashMap<>();
        char[] chs = str.toCharArray();
        for(char s:chs){
            first.put(s,!first.containsKey(s));
        }
        for(int i = 0;i < chs.length;i++){
            if(first.get(chs[i]))
                return i;
        }
        return -1;
    }
}

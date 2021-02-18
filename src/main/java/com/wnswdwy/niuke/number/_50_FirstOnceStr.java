package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-18 13:11
 *
 *      50. 第一个只出现一次的字符位置
 *      NowCoder
 *
 *      题目描述
 *      在一个字符串中找到第一个只出现一次的字符，并返回它的位置。
 */
public class _50_FirstOnceStr {

    public int FirstNotRepeatingChar(String str) {

//        Map<Character,Boolean> first = new HashMap<>();
//         char[] chs = str.toCharArray();
//         for(char s:chs){
//             first.put(s,!first.containsKey(s));
//         }
//         for(int i = 0;i < chs.length;i++){
//             if(first.get(chs[i]))
//                 return i;
//         }
//         return -1;

        int[] ss = new int[256];
        for(int i = 0;i < str.length();i++)
            ss[str.charAt(i)]++;
        for(int i = 0;i < str.length();i++)
            if(ss[str.charAt(i)] == 1)
                return i;
        return -1;
    }
}

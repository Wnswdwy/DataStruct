package com.wnswdwy.niuke.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yycstart
 * @create 2021-02-17 15:25
 *
 *      48. 最长不含重复字符的子字符串
 *      题目描述
 *      输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
 *      例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。
 */
public class _48_MaxNoContainString {

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> dic = new HashMap<>();
        int i = -1, res = 0;
        for (int j = 0; j < s.length(); j++) {
            if (dic.containsKey(s.charAt(j)))
                i = Math.max(i, dic.get(s.charAt(j))); // 更新左指针 i
            dic.put(s.charAt(j), j); // 哈希表记录
            res = Math.max(res, j - i); // 更新结果
        }
        return res;
    }
}

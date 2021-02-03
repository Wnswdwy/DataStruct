package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-03 13:22
 *
 *      18. 给一个字符串，和一个正则表达式，看是否匹配
 *
 *      解法2：邪道，直接调用java的 matches 正则表达式匹配方法
 */
public class _19_ZhengZePiPei_Unusual {

    public boolean match(char[] str, char[] pattern)
    {
        String s = new String(str);
        String m = new String(pattern);
        return s.matches(m);
    }
}

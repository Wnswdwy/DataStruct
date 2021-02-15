package com.wnswdwy.niuke.number;

/**
 * @author yycstart
 * @create 2021-02-15 17:54
 *
 * 46. 把数字翻译成字符串
 *
 *      题目描述
 *      给定一个数字，按照如下规则翻译成字符串：1 翻译成“a”，2 翻译成“b”... 26 翻译成“z”。
 *   一个数字有多种翻译可能，例如 12258 一共有 5 种，分别是 abbeh，lbeh，aveh，abyh，lyh。
 *   实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 */
public class _46_NumberToString {


    public int translateNum(int num) {
        String n=Integer.toString(num);
        return numsoftrans(n,0);
    }
    private int  numsoftrans(String n,int i) {
        if(i==n.length()||i==n.length()-1) return 1;
        if(Integer.valueOf(n.substring(i,i+1))!=0&&Integer.valueOf(n.substring(i,i+2))<26)
            return numsoftrans(n, i+1)+numsoftrans(n, i+2);
        return numsoftrans(n, i+1);
    }
}

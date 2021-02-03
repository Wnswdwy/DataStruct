package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-02-03 13:51
 *      20. 判断一个字符串是不是数值
 */
public class _20_CharArrayIsNumber_UseFunction {


    public boolean isNumeric(char[] str) {

        if (str == null || str.length == 0)
            return false;
        return new String(str).matches("[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?");
    }
}

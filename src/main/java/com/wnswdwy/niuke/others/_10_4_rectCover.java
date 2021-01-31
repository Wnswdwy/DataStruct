package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-01-31 15:06
 */
public class _10_4_rectCover {
    public int rectCover(int target) {
        int sum = 0;
        if( target == 1 || target == 2)
            return target;
        if(target > 1){
            sum = rectCover(target -1) + rectCover(target -2);
        }
        return sum;
    }
}

package com.wnswdwy.niuke.array;

/**
 * @author yycstart
 * @create 2021-01-31 14:30
 */
public class _11_RotateArrayMinuteNumber {
    public int minNumberInRotateArray(int [] array) {
        if(array.length == 0){
            return 0;
        }

        int l = 0,r = array.length -1;
        while(l < r){
            int m = (l + r) / 2 ;
            if(array[m] <= array[r]){
                r = m;
            }else{
                l = m + 1;
            }
        }
        return array[l];
    }
}

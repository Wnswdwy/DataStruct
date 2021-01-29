package com.wnswdwy.array;

import java.util.Arrays;

/**
 * @author yycstart
 * @create 2021-01-29 11:27
 */
public class _03_SearchOneNumIsAgen {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,2,5};
        int[] duplication = new int[num.length];
        duplicate(num,6,duplication);
        System.out.println(Arrays.toString(duplication));
    }

    public static boolean duplicate(int[]num, int length, int[] duplication){
        if (num == null || length <= 0)
            return false;

        for (int i = 0; i < length; i++) {
            while(num[i] != i){
                if(num[i] == num[num[i]]){
                    duplication[0] = num[i];
                    return true;
                }
                swap(num,i,num[i]);
            }
        }
        return false;
    }

    private static void swap(int[] num,int i,int j){
        int t = num[i];
        num[i] = num[j];
        num[j] = t;

    }
}


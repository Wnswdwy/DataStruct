package com.wnswdwy.niuke.print;

import java.util.ArrayList;

/**
 * @author yycstart
 * @create 2021-02-04 17:01
 */
public class _29_SortPrintMatrix {

    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> ret = new ArrayList<>();

        //右下左上
        int left = 0,right = matrix[0].length - 1,up = 0,down = matrix.length - 1;

        int num = 0;


        while(true){
            //右
            for(int i = left;i <= right;i++)
                ret.add(matrix[up][i]);
            if(++up > down) break;

            //下
            for(int i = up;i <= down;i++)
                ret.add(matrix[i][right]);
            if(-- right < left) break;

            //左
            for(int i = right;i >= left;i--)
                ret.add(matrix[down][i]);
            if(--down < up) break;

            //上
            for(int i = down;i >= up;i--)
                ret.add(matrix[i][left]);

            if(++left > right) break;

        }
        return ret;

    }
}

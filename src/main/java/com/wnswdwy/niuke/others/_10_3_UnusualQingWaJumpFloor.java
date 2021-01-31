package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-01-31 14:44
 *      10.2 跳台阶
 *
 *      题目描述
 *      一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级...也可以跳 n 级。
 *      求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class _10_3_UnusualQingWaJumpFloor {
    public int JumpFloor(int target) {
        int sum = 0;
        if(target ==1 || target == 2){
            return target;
        }else{
            sum += 2* JumpFloor(target - 1) ;
        }
        return sum;
    }
}

package com.wnswdwy.niuke.others;

/**
 * @author yycstart
 * @create 2021-01-31 14:44
 *      10.2 跳台阶
 *
 *      题目描述
 *      一只青蛙一次可以跳上 1 级台阶，也可以跳上 2 级。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
 */
public class _10_2_QingWaJumpFloor {
    public int JumpFloor(int target) {
        int sum = 0;
        if(target ==1 || target == 2){
            return target;
        }else{
            sum = JumpFloor(target - 1) + JumpFloor(target -2);
        }
        return sum;
    }
}

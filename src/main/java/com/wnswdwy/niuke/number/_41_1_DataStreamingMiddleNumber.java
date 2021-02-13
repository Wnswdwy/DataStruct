package com.wnswdwy.niuke.number;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author yycstart
 * @create 2021-02-13 11:41
 *
 *      41.1 数据流中的中位数
 */
public class _41_1_DataStreamingMiddleNumber {

    /**
     * the medians
     * @param operations int整型二维数组 ops
     * @return double浮点型一维数组
     */
    public double[] flowmedian (int[][] operations) {
        // write code here
        if(operations == null){return new double[0];}

        List<Double> list = new ArrayList<>(10);
        MiddleKeeper mk = new MiddleKeeper();
        for(int[] oper: operations){
            switch(oper[0]){
                case 1: mk.set(oper[1]); break;
                case 2: list.add(mk.get());
            }
        }
        int len = list.size();
        double[] res = new double[len];
        for(int i = 0; i < len; ++i){
            res[i] = list.get(i);
        }
        return res;
    }

    private class MiddleKeeper{
        Queue<Integer> nums1 = new PriorityQueue<>((x, y)->{return y - x;});
        Queue<Integer> nums2 = new PriorityQueue<>();

        public double get(){
            int size1 = nums1.size();
            int size2 = nums2.size();
            if(size1 + size2 == 0){return -1;}
            if(size1 == size2){
                return (nums1.peek() + nums2.peek()) / 2.0;
            }else if(size1 > size2){
                return nums1.peek();
            }else{
                return nums2.peek();
            }
        }

        public void set(int num){
            if(nums1.size() > 0 && num < nums1.peek()){
                nums1.offer(num);
            }else{
                nums2.offer(num);
            }
            this.adjust();
        }

        private void adjust(){
            while(nums1.size() - nums2.size() > 1){
                nums2.offer(nums1.poll());
            }
            while(nums2.size() - nums1.size() > 1){
                nums1.offer(nums2.poll());
            }
        }

    }
}

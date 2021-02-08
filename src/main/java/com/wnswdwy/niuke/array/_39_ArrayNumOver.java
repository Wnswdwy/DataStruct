package com.wnswdwy.niuke.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yycstart
 * @create 2021-02-08 17:18
 */
public class _39_ArrayNumOver {

    public int majorityElement(int[] nums) {

        if(nums.length == 0){
            return 0;
        }

        int len = nums.length;
        int threshold = len/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < len; i++){
            if(!map.keySet().contains(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }

        for(Integer key: map.keySet()){
            if(map.get(key) > threshold){
                return key;
            }
        }

        return 0;

    }
}

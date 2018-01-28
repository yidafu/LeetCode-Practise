package org.yidafu.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int pre = 0 ,next = 1;
        for (int i = 0; i < nums.length ; ++ i ) {
            for ( int j = i + 1 ; j < nums.length ; ++j ) {
                if( nums[i] + nums[j] == target ) {
                    pre = i;
                    next = j;
                    break;
                }
            }
        }
        return  new int[]{pre,next};
    }
    public int[] others1(int[] numbers, int target){
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}

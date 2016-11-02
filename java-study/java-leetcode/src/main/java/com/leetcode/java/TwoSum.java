package com.leetcode.java;

import java.util.*;

/**
 * Given an array of integers ,return indices of the two numbers such that
 * they add up to a specific target. You may assume that each input would
 * have exactly one solution.
 *
 * @author: SunnyScent
 * @Date: 2016-10-24
 * @Time: 14:28
 */

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] result={-1,-1};
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                result[0] = map.get(nums[i]);
                result[1] = i;
                return result;
            }
            map.put(target-nums[i],i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums={1,7,2,15};
        int target=9;
        int[] result=TwoSum.twoSum(nums,target);
        for(int num:result){
            System.out.println(num);
        }
    }
}
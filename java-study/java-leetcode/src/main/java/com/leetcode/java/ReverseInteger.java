package com.leetcode.java;

/**
 * Reverse digits of an integer.
 * @author: SunnyScent
 * @Date: 2016-10-24
 * @Time: 18:53
 */

public class ReverseInteger {
    public static int reverse(int x){
        long z=x;
        long y=0;
        while (z!=0){
            long temp=z%10;
            y=y*10+temp;
            if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE){
                return 0;
            }
            z=z/10;
        }
        return (int)y;

    }

    public static void main(String[] args) {
        System.out.println(ReverseInteger.reverse(-2147483412));
    }
}
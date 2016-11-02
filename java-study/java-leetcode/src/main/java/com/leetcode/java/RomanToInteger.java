package com.leetcode.java;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a roman numeral,convert it to an integer
 *
 * @author: SunnyScent
 * @Date: 2016-10-25
 * @Time: 18:34
 */

public class RomanToInteger {
    public static int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        char[] c = s.toUpperCase().toCharArray();
        int clength = c.length;
        int sum = map.get(c[clength-1]);
        int max=map.get(c[clength-1]);
        for (int i = 1; i < clength; i++) {
            if(map.get(c[clength-1-i])>=max){
                sum=sum+map.get(c[clength-1-i]);
                max=map.get(c[clength]-1-i);
            }else {
                sum=sum-map.get(c[clength-1-i]);
                d
            }
        }
        if(map.get(c[0])>=map.get(c[clength-1])){
            for (int i = 0; i < clength; i++) {
                sum=sum+map.get(c[i]);
            }
        }else {
            for (int i = 0; i < clength; i++) {

            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(RomanToInteger.romanToInt("1234"));
    }
}
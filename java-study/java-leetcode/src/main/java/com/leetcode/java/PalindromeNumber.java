package com.leetcode.java;

/**
 * Determine whether an interger is palindrome. Do this  without extra space.
 * @author: SunnyScent
 * @Date: 2016-10-24
 * @Time: 16:20
 */

public class PalindromeNumber {
    public static boolean isPalindrome(int x){
        int y,z=x;
        if(x<0){
            return false;
        }
        y=x%10;
        if(y==z){
            return true;
        }
        x=x/10;
        while (x>0){
            y=y*10+(x%10);
            x=x/10;
        }
        if(y==z){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int a=1112111;
        System.out.println(PalindromeNumber.isPalindrome(a));
    }

}

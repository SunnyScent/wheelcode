package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: SunnyScent
 * @Date: 2016-10-10
 * @Time: 17:33
 */

public class Reverse {
    public static void main(String[] args) {
        Stack<Integer> stack;
        stack=new Stack<>();
        while (!StdIn.isEmpty()){
            stack.push(StdIn.readInt());
        }

        for (int i:stack) {
            StdOut.println(i);
        }
    }
}
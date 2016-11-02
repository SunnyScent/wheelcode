package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: SunnyScent
 * @Date: 2016-09-23
 * @Time: 10:37
 */

public class Stats {
    public static void main(String[] args) {
        Bag<Double> numbers=new Bag<>();
        while (!StdIn.isEmpty()){
            numbers.add(StdIn.readDouble());
        }
        int N=numbers.size();


        double sum=0.0;


        /**
         * sum of numbers
         */
        for (double x:numbers) {
            sum+=x;
        }

        // compute std
        double mean=sum/N;
        sum=0.0;
        for (double x:numbers) {
            sum+=(x-mean)*(x-mean);
        }

        double std=Math.sqrt(sum/(N-1));

        StdOut.printf("Mean : %.2f\n",mean);
        StdOut.printf("Std Dev: %.2f\n",std);
    }
}
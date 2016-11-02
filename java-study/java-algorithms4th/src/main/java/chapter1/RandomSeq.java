package chapter1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * The {@code RandomSeq} class is a client that prints out a pseudorandom
 * sequence of real numbers in given range
 * author: SunnyScent
 * Date: 2016-09-20
 * Time: 14:35
 */

public class RandomSeq {
    //this class should not be instantiated
    private RandomSeq(){}

    /**
     * Reads in two command-line arguments lo an hi and prints n uniformly
     * random real numbers in [lo,hi] to standard output.
     * @param args
     */
    public static void main(String[] args) {
        //command-line argument
        int n =Integer.parseInt(args[0]);

        if(args.length==1){
            //generate and print n numbers between 0.0 and 1.0
            for (int i = 0; i < n; i++) {
                double x= StdRandom.uniform();
                StdOut.println(x);
            }
        }else if(args.length==3){
            double lo=Double.parseDouble(args[1]);
            double hi=Double.parseDouble(args[2]);
            for (int i = 0; i < n; i++) {
                double x=StdRandom.uniform(lo,hi);
                StdOut.printf("%.2f\n",x);
            }
        }else {
            throw new IllegalArgumentException("Invalid number of arguments");
        }
    }
}
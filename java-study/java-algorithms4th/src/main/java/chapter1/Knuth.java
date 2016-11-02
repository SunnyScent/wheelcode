package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * The {@code Knuth} class provides a client for reading in a
 * sequence of strings and <em>shuffling</em> then using the Knuth (or Fisher-Yates)
 * shuffling algorithm.This application guarantees to rearrange the
 * elements in uniformly random order ,under the assumption that Math.random() generates independent
 * and uniformly distributed numbers between 0 and 1
 * @author: SunnyScent
 * @Date: 2016-09-20
 * @Time: 19:43
 */

public class Knuth {
    //this class should not be instantiated
    private Knuth(){}

    /**
     * Rearranges an array of objects in uniformly random order
     * @param a the array  to be shuffled
     */
    public static void shuffle(Object[] a){
        int n=a.length;
        for (int i = 0; i < n; i++) {
            //choose index uniformly in [i,n-i]
            int r=i+(int)(Math.random()*(n-i));
            Object swap=a[r];
            a[r]=a[i];
            a[i]=swap;
        }
    }

    /**
     * Reads in a sequence of string from standard input ,shuffles them,
     * and prints out the result;
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        //read in data
        String[] a= StdIn.readAllStrings();

        //shuffles the array

        shuffle(a);

        //print the results
        for (int i = 0; i < a.length; i++) {
            StdOut.println(a[i]);
        }

    }
}
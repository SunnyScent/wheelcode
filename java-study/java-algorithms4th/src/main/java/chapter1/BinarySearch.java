package chapter1;


import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * The binarySearch class provides a static method for binary searching for an integer
 * in a sorted array of integers
 * author: SunnyScent
 * Date: 2016-09-20
 * Time: 8:32
 */

public class BinarySearch {
    /**
     * This class should not be instantiated
     * */
    private BinarySearch(){}


    /**
     * Returns the index of the specified key in the specified array.
     * @param a the array of integers ,must be sorted in ascending order
     * @param key  the search key
     * @return index of the key in array if present,otherwise -1
     */
    public static int indexOf(int a[] ,int key){
        int lo=0;
        int hi=a.length-1;
        while (lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(key<a[mid]){
                hi=mid-1;
            }else if (key>a[mid]){
                lo=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    @Deprecated
    public static int rank(int key,int a[]){
        return indexOf(a,key);
    }


    /**
     * Reads a sequence of integers from the whitelist file,specified as
     * a command-line argument; reads in integers from standard input;
     *
     * prints to standard output those integers that do not appear in the file
     * @param args args the command-line arguments
     */
    public static void main(String[] args) {
        //read integer from a file
        In in=new In(args[0]);
        int[] whitelist=in.readAllInts();

        //sort the array
        Arrays.sort(whitelist);

        //read integer key from standard input ,print if not in whitelist
        while (!StdIn.isEmpty()){
            int key=StdIn.readInt();
            if(indexOf(whitelist,key)==-1){
                StdOut.print(key);
            }
        }
    }
}
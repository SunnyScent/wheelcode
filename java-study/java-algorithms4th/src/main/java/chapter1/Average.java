package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * The {@code Average} class provides a client for reading in a sequence
 * of real numbers and printing out their average
 * @author: SunnyScent
 * @Date: 2016-09-20
 * @Time: 15:18
 */

public class Average {
    //this class should not be instantiated
    private Average(){}

    /**
     * Reads a sequence of real numbers from standart input and prints
     * out their average to standard output
     * @param args the command-line argument
     */
    public static void main(String[] args) {
        //number input value
        int count=0;
        //sum of input values
        double sum=0.0;

        //read data and computing statistics
        while(!StdIn.isEmpty()){
            double value=StdIn.readDouble();
            sum+=value;
            count++;
        }
        //computing the average
        double average=sum/count;
        //print result
        StdOut.printf("Average is "+average);

    }
}
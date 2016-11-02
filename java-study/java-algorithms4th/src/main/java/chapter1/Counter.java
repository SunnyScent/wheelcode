package chapter1;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

/**
 * The {@code Counter} class is a mutable data type to encapsulate a counter.
 *
 * @author: SunnyScent
 * @Date: 2016-09-21
 * @Time: 9:06
 */

public class Counter implements Comparable<Counter> {
    //counter name
    private final String name;
    private int count = 0;

    /**
     * Initializes a new counter starting at 0,with the given id
     *
     * @param id
     */
    public Counter(String id) {
        this.name = id;
    }

    /**
     * increments the counter by 1
     */
    public void increment() {
        count++;
    }

    /**
     * Returns the current value of this counter
     *
     * @return the current value of this counter
     */
    public int tally() {
        return count;
    }

    /**
     * Returns the string representation of this counter
     *
     * @return string representation  of this counter
     */
    @Override
    public String toString() {
        return count + " " + name;
    }

    /**
     * Compares this counter to specified counter
     *
     * @param that the specified counter
     * @return {@code 0} if the value of this counter equals the value of that counter;
     * a negative value if the value of this counter is less than the value of that counter;
     * a positive value if the value of this counter is greater that the value of that counter
     */
    @Override
    public int compareTo(Counter that) {
        if (this.count < that.count) {
            return -1;
        } else if (this.count > that.count) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * Reads two commnd-line integers n and trails;creates n counters ;
     * increments trials counters at random ;and prints results
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        //create n counters
        Counter[] hits = new Counter[n];
        for (int i = 0; i < n; i++) {
            hits[i] = new Counter("counter" + i);
        }

        //increment trials counters at random
        for (int i = 0; i < trials; i++) {
            hits[StdRandom.uniform(n)].increment();
        }

        //print result
        for (int i = 0; i < n; i++) {
            StdOut.println(hits[i]);
        }
    }
}
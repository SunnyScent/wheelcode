package chapter1;

import edu.princeton.cs.algs4.StdDraw;

/**
 * Drawing hyperbola
 * @author: SunnyScent
 * @Date: 2016-09-20
 * @Time: 16:30
 */

public class Hyperbola {
    //this class should not be instantiated
    private Hyperbola(){}

    public static void main(String[] args) {
        //number of point
        int N=100;

        StdDraw.setXscale(0,N);
        StdDraw.setYscale(0,N*N);
        StdDraw.setPenRadius(.01);

        for (int i = 0; i < N; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i,i*i);
            StdDraw.point(i,i*Math.log(i));
        }
    }
}
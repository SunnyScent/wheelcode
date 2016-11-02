package chapter1;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

/**
 * Drawing statistical chart
 * @author: SunnyScent
 * @Date: 2016-09-20
 * @Time: 16:37
 */

public class StatisticalChart {
    //prevent instantiated
    private StatisticalChart(){}

    /**
     * drawing statistical chart in screen
     * @param args
     */
    public static void main(String[] args) {
        //number of rectangle
        int N=50;

        double[] a=new double[N];
        for (int i = 0; i < N; i++) {
            a[i]=StdRandom.uniform();
        }
        //Arrays.sort(a);

        for (int i = 0; i < N; i++) {
            double x=1.0*i/N;
            double y=a[i]/2.0;

            double rw=0.5/N;
            double rh=a[i]/2.0;
            StdDraw.filledRectangle(x,y,rw,rh);
        }




    }
}
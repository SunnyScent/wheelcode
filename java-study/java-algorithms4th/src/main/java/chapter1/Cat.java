package chapter1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

/**
 * The {@code Cat} class provides a client for concatenating the result
 * of several text files
 * @author: SunnyScent
 * @Date: 2016-09-20
 * @Time: 19:29
 */

public class Cat {
    //this class should not be instantiated
    private Cat(){}

    /**
     * Read a sequence of text files specified as the first command-line arguments,
     *concatenates them ,and writes the results to the file specified as the last command-line argument
     * @param args the command-line argument
     */
    public static void main(String[] args) {
        Out out=new Out(args[args.length-1]);
        for (int i = 0; i < args.length-1; i++) {
            In in=new In(args[i]);
            String s=in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
package chapter1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author: SunnyScent
 * @Date: 2016-10-10
 * @Time: 19:09
 */

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops=new Stack<>();
        Stack<Double> vals=new Stack<>();

        while (!StdIn.isEmpty()){
            //read token ,push if operator
            String s=StdIn.readString();

            if(s.equals("(")){
            }else if(s.equals("+")){
                ops.push(s);
            }else if(s.equals("-")){
                ops.push(s);
            }else if(s.equals("*")){
                ops.push(s);
            }else if(s.equals("/")){
                ops.push(s);
            }else if(s.equals("sqrt")){
                ops.push(s);
            }else if(s.equals(")")){
                //Pop, evaluate,and push result if token is")"
                String op=ops.pop();
                double v=vals.pop();
                if(op.equals("+")){
                    v=vals.pop()+v;
                }else if(op.equals("-")){
                    v=vals.pop()-v;
                }else if(op.equals("*")){
                    v=vals.pop()*v;
                }else if(op.equals("/")){
                    v=vals.pop()/v;
                }else if(op.equals("sqrt")){
                    v=Math.sqrt(v);
                }
                vals.push(v);
            }else {
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
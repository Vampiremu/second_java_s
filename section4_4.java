//定义方程类ax2+bx+c=0， 该类成员变量有a,b,c ,  有一个成员方法负责求x根并输出根，有一个构造方法负责对成员变量a,b,c赋初值
//定义一个执行主类，产生2个对象，对2个对象方程的成员变量赋值，并调用成员方法求出根并输出。

import static java.lang.System.*;


class Equation{
    private double a,b,c;
    private double root_1,root_2;
    private boolean YN;
    public Equation(double a,double b,double c){
        this . a = a;
        this . b = b;
        this . c = c;
        if (this . a != 0) YN = true;
        else YN = false;
    }

    public void getRoot(){
        if (YN){
            double D = b * b - 4 * a * c;
            if(D >= 0){
                root_1 = ( - b + Math.sqrt(D) ) / ( 2 * a );
                root_2 = ( - b - Math.sqrt(D) ) / ( 2 * a );
                out.println("两个根分别为："+root_1+"  "+root_2);
            }
            else out.println("方程无实根");
        }
        else out.println("非二次方程");
    }
}

public class section4_4 {
    public static void main(String[] args){
        double a_1 = 2,b_1 = 6;
        double a_2 = 3,b_2 =2;
        double c_1 = 1,c_2 = 1;
        Equation first = new Equation(a_1,b_1,c_1);
        Equation second = new Equation(a_2,b_2,c_2);
        first.getRoot();
        second.getRoot();
    }
}

//定义一个运算器类，该类有2个成员变量，4个成员方法（分别是加法、减法、乘法和除法运算），以及构造方法对成员变量赋初值
//定义主类，产生2个对象，输出2个对象的加法、减法、乘法和除法运算结果

import static java.lang.System.*;

class Counter{
    private int a,b;

    public Counter(int a,int b){
        this . a = a;
        this . b = b;
    }

    public int Add(){
        return a+b;
    }

    public int Minus(){
        return a-b;
    }

    public int Ride(){
        return a*b;
    }

    public double Divide(){
        double c = (double)a/(b*1.0);
        return c;
    }
}

public class section4_2 {
    public static void main(String[] args){
        int a_1 = 4,b_1 = 2;
        int a_2 = 8,b_2 = 3;
        Counter first = new Counter(a_1,b_1);
        Counter second = new Counter(a_2,b_2);
        out.println(first.Add());
        out.println(first.Minus());
        out.println(first.Ride());
        out.println(first.Divide());
        out.println(second.Add());
        out.println(second.Minus());
        out.println(second.Ride());
        out.println(second.Divide());
    }
}

//编写Java应用程序，自定义Circle类，类中有半径double 变量r,一个静态类变量pi,利用构造方法实现对半径是3和5.5的初始化，自定义getArea方法实现圆面积求解;
import static java.lang.System.*;

class Circle{
    private double r;
    static double pi = 3.14;
    public Circle(double r){
        this . r = r;
    }

    public double getArea(){
        double area;
        area = pi * r * r;
        return area;
    }
}

public class khsection4 {
    public static void main(String[] args){
        double r_1 = 3.0, r_2 = 5.5;
        Circle t_first = new Circle(r_1);
        Circle t_second = new Circle(r_2);
        out.println("第一个："+t_first.getArea());
        out.println("第二个："+t_second.getArea());
    }
}

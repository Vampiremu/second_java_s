//(1)编写一个接口ShapePara，要求： 接口中的方法： int getArea()：获得图形的面积。int getCircumference()：获得图形的周长
//(2)编写一个圆类Circle，要求：圆类Circle实现接口ShapePara。
//该类包含有成员变量：
//radius:public 修饰的double类型radius,表示圆的半径。
//x：private修饰的double型变量x，表示圆心的横坐标。
//y：protected修饰的double型变量y，表示圆心的纵坐标。
//包含的方法有：
//Circle(double radius) 有参构造方法。以形参表中的参数初始化半径，圆心为坐标原点。 double getRadius()：获取半径为方法的返回值。
//void setCenter(double x, double y)：利用形参表中的参数设置类Circle的圆心坐标。void setRadius(double radius)：利用形参表中的参数设置类Circle的radius域。
//利用getArea方法实现圆面积的求解。

import static java.lang.System.*;
import java.util.Scanner;

interface ShapPare{
    double pi = 3.14;
    double getArea(double Radious);
    double getCircumference(double Radious);
}

class Circle_2 implements ShapPare{
    public double radious;
    private double X;
    protected double Y;

    public Circle_2(double radious){
        this . radious = radious;
        this . X = 0;
        this . Y = 0;
    }

    public void setRadious(double radious){
        this. radious = radious;
    }

    public double getRadious(){
        return this.radious;
    }

    public void setCenter(double X,double Y){
        this . X = X;
        this . Y = Y;
    }

    public double getArea(double Radious) {
        double Area;
        Area = pi * Radious * Radious;
        return Area;
    }

    public double getCircumference(double Radious) {
        double perimter;
        perimter = 2 * pi * Radious;
        return perimter;
    }
}

public class khsection5_4 {
    public static void main(String[] args){
         double radious;
         out.print("输入半径：");
         Scanner in_1 = new Scanner(in);
         radious = in_1.nextDouble();
         Circle_2 new_1 = new Circle_2(radious);
         out.println("面积："+new_1.getArea(radious));
         out.println("周长："+new_1.getCircumference(radious));
    }
}

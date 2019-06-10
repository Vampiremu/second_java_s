//定义一个圆柱体类,包括成员变量静态成员半径、非静态成员高、成员方法包括求底圆面积静态方法，以及后面非静态方法求体积的方法、求表面积的方法，带2个参数的构造方法。
//定义一个主类，产生2个对象，输出圆柱体表面积、体积。

import static java.lang.System.*;

class Cylinder{
    private static double radius;
    private double high;

    public Cylinder(double radius,double high){
        this . high = high;
        this . radius = radius;
    }

    public void setRadius(double radius) {
        this . radius = radius;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getRadius(){
        return this . radius;
    }

    public double getHigh(){
        return this . high;
    }

    public static double Basal_area(){
        double area = 3.14 * radius * radius;
        return area;
    }

    public double Sup_area(){
        double sup = (6.28 * radius * high) + (2 * Basal_area());
        return sup;
    }

    public double Volume(){
        double volume = Basal_area() * high;
        return volume;
    }
}

public class section_3 {
    public static void main(String[] args){
        double radius_1 = 5.0 , radius_2 = 6.0;
        double high_1 = 6.0 , high_2 = 8.0;
        Cylinder first = new Cylinder(radius_1,high_1);
        out.println(first.Basal_area());
        out.println("第一个的表面积"+first.Sup_area());
        out.println("第一个的体积"+first.Volume());
        Cylinder second = new Cylinder(radius_2,high_2);
        out.println("第二个的表面积"+second.Sup_area());
        out.println("第二个的体积"+second.Volume());
    }
}

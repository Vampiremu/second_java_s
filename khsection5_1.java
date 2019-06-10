//定义图形类Shape，该类中有获得面积的方法getArea()；定义长方形类Rect，该类是Shape的子类，类中有矩形长和宽的变量double a,double b，设置长和宽的方法setWidth()、setHeight(),使用getArea()求矩形面积。

import static java.lang.System.*;

class Shape{
    private double a,b;
    public Shape(){

    }

    public Shape (double a,double b) {
        this . a = a ;
        this . b = b ;
    }

    public double gets_Area(){
        double S_area;
        S_area = a * b;
        return S_area;
    }

    public void setA(double a){
        this . a = a;
    }

    public void setB(double b){
        this . b = b;
    }
}

class Rect extends Shape{

    public void setsA(double a){
        this .setA(a);
    }
    public void setsB(double b){
        this . setB(b);
    }
}

public class khsection5_1 {
    public static void main(String[] args){
        double Width = 5.0, height = 6.0;
        Rect rect_1 = new Rect();
        rect_1.setA(Width);
        rect_1.setB(height);
        out.println(rect_1.gets_Area());
    }
}

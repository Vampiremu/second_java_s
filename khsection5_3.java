//定义形状抽象类shape，成员抽象方法为showArea()，抽象方法作用是求出面积并输 出。
//定义矩形类Rectangle是抽象类shape的子类,成员变量为长c与宽k，成员方法showArea重写上面抽象方法，求出矩形面积并输出。
//在主类中定义上传型对象，通过键盘输入值，该值通过矩形带参构造方法，给矩形成员变量赋值，最后计算输出矩形面积。

import static java.lang.System.*;
import java.util.Scanner;

abstract class shape{
    private double Width,Height;
    public shape(){

    }
    public shape (double Width,double Height){
        this . Width = Width;
        this . Height = Height;
    }

    public double getHeight() {
        return Height;
    }

    public double getWidth() {
        return Width;
    }

    abstract double showArea(double R_area);
}

class Rectangle extends shape{
    public Rectangle(double Width,double Height){
        super(Width, Height);
    }

    @Override
    double showArea(double R_area) {
        R_area = getWidth() * getHeight();
        return R_area;
    }

}

public class khsection5_3 {
    public static void main(String[] args){
        double width,heigh;
        double r_area = 0;
        Scanner area = new Scanner(in);
        out.print("输入长：");
        width = area.nextDouble();
        out.print("输入宽：");
        heigh = area.nextDouble();
        Rectangle b = new Rectangle(width,heigh);
        out.println("矩形面积为："+b.showArea(r_area));
    }
}

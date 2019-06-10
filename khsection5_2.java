//编写一个类Student，该类中包含了name、age、number三个属性，为该类提供两个构造方法，
// 一个是默认的构造方法，另一个是包含初始化三个参数的构造方法，
// 编写第二个类，StudentTrans，该类的作用是提示用户输入姓名、年龄和学号三个属性，
// 并且可以通过Student类的toString方法输出该对象的内容，最后编写主类StudentTransTest，
// 创建一个Student的对象，通过对象输出成员值。

import static java.lang.System.*;
import java.util.Scanner;

class Student_4{
    private String name;
    private int age;
    private long number;

    public Student_4(){

    }

    public Student_4(String name,int age,long number){
        this . name = name;
        this . age = age;
        this . number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public void tostring(){
        out.println("姓名："+this . name);
        out.println("年龄："+this . age);
        out.println("学号："+this . number);
    }
}

class StudentTrans extends Student_4{
    public StudentTrans(){

    }
    public StudentTrans(String name,int age,long number){
        super(name,age,number);
    }
    public void input(){
        Scanner input = new Scanner(in);
        out.print("输入姓名：");
        String name_in = input.nextLine();
        setName(name_in);
        out.print("输入年龄：");
        int age_in = input . nextInt();
        setAge(age_in);
        out.print("输入学号：");
        long number_in = input . nextLong();
        setNumber(number_in);
    }
}

public class khsection5_2 {
    public static void main(String[] args){
        StudentTrans one_s = new StudentTrans();
        one_s.input();
        one_s.tostring();
    }
}

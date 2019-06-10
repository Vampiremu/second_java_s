//定义一个类Student，该类有name、age、number三个private权限成员变量，另有一个是包含初始化三个成员变量的构造方法，以及输出3个成员变量值的一个成员方法。

import static java.lang.System.*;

class Student_2{
    private String name;
    private int age;
    private int number;

    public Student_2(String name,int age,int number){
        this . name = name;
        this . age = age;
        this . number = number;
    }

    public void getStudent(){
        out.println("姓名："+name);
        out.println("年龄："+age);
        out.println("学号："+number);
    }
}

public class section4_3 {
    public static void main(String[] args){
        String name_1 = "张三",name_2 = "李四";
        int age_1 = 18, number_1 = 111111, age_2 = 20, number_2 = 22222;
        Student_2 one = new Student_2(name_1,age_1,number_1);
        Student_2 two = new Student_2(name_2,age_2,number_2);
        one.getStudent();
        two.getStudent();
    }
}

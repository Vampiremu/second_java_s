//利用类的继承，创建以下类：
//Person类，包含姓名、身份证号码，其中身份证号码为私有权限。成员方法根据自己的需要定义
//Student类，继承Person，除此之外，包含学生的数学、英文的成绩。成员方法根据自己的需要定义
//Teacher类，继承Person，除此之外，包含教师的工资。成员方法根据自己的需要定义
//最后定义主类，产生教师对象，学生对象，输入教师全部成员值与学生全部成员值，并输出教师、学生全部成员数据值

import static java.lang.System.*;
import java.util.Scanner;

class Preson{
    private String name;                                          //姓名
    private String ID_number;                                     //身份证号
    private boolean identity;                                     //身份
    public Preson(String name,String ID_number) {
        this . name = name;
        this . ID_number = ID_number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setID_number(String ID_number){
        this . ID_number = ID_number;
    }

    public String getName(){
        return this.name;
    }

    public String getID_number(){
        return this.ID_number;
    }

    public void setIdentity(boolean identity) {
        this.identity = identity;
    }

    public boolean getIdentity(){
        return this.identity;
    }
}

class Student_3 extends Preson{
    int mathscore,englishscore;                                      //数学以及英语成绩
    public Student_3(int mathscore,int englishscore,String name, String ID_number) {
        super(name, ID_number);
        this . mathscore = mathscore;
        this . englishscore = englishscore;
        setIdentity(false);
    }

    public int getMathscore(){
        return this.mathscore;
    }

    public int getEnglishscore(){
        return this.englishscore;
    }
}

class Teacher extends Preson{
    int salary;
    public Teacher(int salary,String name,String ID_number){
        super(name,ID_number);
        this . salary = salary;
        setIdentity(true);
    }

    public int getSalary(){
        return this.salary;
    }
}

public class section5_1 {
    public static void main(String[] args){
        String Id_s = "420901201906102222" , Id_t = "420901200007222793";
        String name_s = "木",name_t = "逸";
        int Salary = 10000;
        int s_mathscore = 99,s_englishscore = 60;
        Teacher First = new Teacher(Salary,name_t,Id_t);
        Student_3 Second = new Student_3(s_mathscore,s_englishscore,name_s,Id_s);
        out.println("姓名"+First.getName());
        out.print("身份：");
        if (First.getIdentity()) out.println("老师");
        else out.println("学生");
        out.println("身份证号："+First.getID_number());
        out.println("工资："+First.getSalary());
        out.println("..................");
        out.println("姓名："+Second.getName());
        out.print("身份：");
        if (Second.getIdentity()) out.println("老师");
        else out.println("学生");
        out.println("身份证号："+Second.getID_number());
        out.println("数学成绩："+Second.getMathscore());
        out.println("英语成绩："+Second.getEnglishscore());
    }
}

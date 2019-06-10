// 从键盘输入5个学生的成绩，每输入一个成绩按回车确认，最后输入非数字字符串结束输入操作
//如果成绩在100-90间输出优，89-80间输出良，79-70间输出中，69-60间输出及格，否则为不及格

import static java.lang.System.*;
import java.util.Scanner;

class Student {
    private int stugrade;
    private String stustand;
    public Student () {
        this . stugrade = 60;
        this . stustand = "及格";
    }

    public Student (int stugrade) {
        this . stugrade = stugrade;
    }

    public void setStugrade(int stugrade){
        this . stugrade = stugrade;
        if (this . stugrade < 60) this . stustand = "不及格";
        if (this . stugrade >= 60 && this . stugrade < 70) this . stustand = "及格";
        if (this . stugrade >= 70 && this . stugrade < 80) this . stustand = "中";
        if (this . stugrade >= 80 && this . stugrade < 90) this . stustand = "良";
        if (this . stugrade >= 90 ) this . stustand = "优";
    }

    public double getStugrade(){
        return stugrade;
    }

    public String getStustand(){
        return stustand;
    }
}

public class second_1 {
    public static void main(String[] args){
        Scanner stu = new Scanner(in);
        Student[] Stu = new Student[5];
        for (int i = 0 ; i < 5 ; i ++) {
            int change = stu.nextInt();
            Stu[i] = new Student();
            Stu[i].setStugrade(change);
        }
        for (int i = 0 ; i < 5 ; i ++) out.println(Stu[i].getStustand());
    }
}

//学校中有教师和学生两类人，而在职研究生既是教师又是学生。
// 设计两个接口studentinterface和teacherinterface。
// 其中，studentinterface接口包含setFee()getFee()方法，分别用于设置和获取学生的学费；
// teacherinterface接口包含setPay()和getPay()方法，分别用于设置和获取教师的工资。
//定义一个研究生类graduate，实现studentinterface接口和teacherinterface接口，它的成员变量有name，sex，age，fee，pay。
//创建一个姓名为“zhangsan”的研究生，统计他的年收入和学费，如果收入减去学费不足2000元，则输出“provide a loan”（需要贷款）信息。
//要求：在graduate中实现各个接口定义的抽象方法

import static java.lang.System.*;
import java.util.Scanner;

interface Studentinterface{
    void setTuition(double tuition);
    double getTuition();
}

interface Teacherinterface{
    void setSalary(double salary);
    double getSalary();
}

class Graduate implements Studentinterface,Teacherinterface{
    private double salary,tuition;
    private String name,gender;
    private int age;
    private boolean loan;

    public Graduate(String name,String gender,int age){
        this . name = name;
        this . gender = gender;
        this . age = age;
    }

    public void setTuition(double tuition){
        this . tuition = tuition;
    }

    public double getTuition() {
        return this . tuition;
    }

    public void setSalary(double salary) {
        this . salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setLoan(boolean loan) {
        this . loan = loan;
    }

    public boolean getLoan(){
        return this . loan;
    }
}

class Manage{
    String name,gender;
    int age;
    double fee,pay;
    Graduate last;
    Scanner init_in = new Scanner(in);
    public void init(){
        out.print("输入姓名：");
        name = init_in.nextLine();
        out.print("输入性别：");
        gender = init_in.nextLine();
        out.print("输入年龄：");
        age = init_in.nextInt();
        last = new Graduate(name,gender,age);
        out.print("输入学费：");
        fee = init_in.nextDouble();
        last.setTuition(fee);
        out.print("输入工资：");
        pay = init_in.nextDouble();
        last.setSalary(pay);
    }

    public String question(){
        String loan_q ;
        boolean change;
        double tuition_sum , salary_sum;
        tuition_sum = 12 * last.getTuition();
        salary_sum = 12 * last.getSalary();
        if ( (salary_sum - tuition_sum) < 2000 ) {
            change = true;
            loan_q = "Provide a loan";
            last.setLoan(change);
        }
        else {
            change = false;
            loan_q = "No loan";
            last.setLoan(change);
        }
        return loan_q;
    }
}

public class khsection5_5 {
    public static void main(String[] args){
        Manage graduate = new Manage();
        graduate.init();
        out.println(graduate.question());
    }
}

//从键盘输入一段字符：I   LOVE   JAVA  , 存放到字符数组中， “异或”m字符运算对该段文字字符数组加密，并输出密文

import static java.lang.System.*;
import java.io.IOException;
import java.util.Scanner;

public class section_2 {
    public static void main(String[] args) throws IOException {
        char change = 'm';
        char[] str = new char[17];
        char[] str_2 = new char[17];
        Scanner strin = new Scanner(in);
        for (int i = 0 ; i < 17 ; i ++){
            str[i] = (char)in.read();
        }
        for (int i = 0 ; i < 17 ; i ++) str_2[i] = (char) (str[i]^change);
        out . print(str_2);
    }
}

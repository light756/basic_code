package plan.attack.variable;

import java.util.Scanner;

public class StringTest {
    static void main() {
        //字符串拼接
        String a = "hello";
        String b = "world";
        String c = a + " " + b;
        System.out.println(c);
        int d=100;
        int e=200;
        String f=d+a+e;
        System.out.println(f);
        f=d+e+a;
        System.out.println(f);
        //算法实验————利用ASC2表进行小写转大写转换
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        System.out.println((char)(ch-32));
        System.out.println(ch-32);
    }
}

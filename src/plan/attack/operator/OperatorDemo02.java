package plan.attack.operator;

import java.util.Scanner;

public class OperatorDemo02 {
    static void main() {
        //本次实验用于测试或运算符，以及与运算符
        //输入一个数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入一个整数：");
        int b = sc.nextInt();
        System.out.println("a与b的运算结果为：" + ((a>0) && (b>0)));
        System.out.println("a或b的运算结果为：" + ((a<0) ||(b>0)));
    }
}

package plan.attack.operator;

import java.util.Scanner;

public class Mod3 {
    static void main() {
        //本次实验用于模拟各个数位之和是否为3的倍数
        //取位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int a = sc.nextInt();
        int sum=0;
        while (a != 0) {
            sum += a % 10;
            a = a / 10;
        }
        if (sum % 3 == 0) {
            System.out.println("是3的倍数");
        } else {
            System.out.println("不是3的倍数");
        }
    }
}

package plan.attack.operator;

import java.util.Scanner;

public class OperatorDemo03 {
    public static void main() {
        //逻辑运算符
        //计算‘7’的有缘数
        //输入一个数，判断它是否是7的有缘数
        //有缘数——7的倍数或者取位后有7的数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = sc.nextInt();
        boolean flag = (n % 7 == 0);
        if (flag) {
            System.out.println("有缘数");
        }
        //取数位
        while (n != 0&&!flag) {
            int a = n % 10;
            if (a == 7) {
                System.out.println("有缘数");
                flag = true;
                break;
            }
            n = n / 10;
        }
        if (!flag) {
            System.out.println("无缘数");
        }
    }
}

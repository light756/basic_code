package plan.attack.variable;


import java.util.Scanner;

public class variabledemo02 {
    public static void main(String[] args) {
        //scanner的使用实验
        Scanner sc = new Scanner(System.in);
        //测试整数录入
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("你输入的整数是：" + a);
        //测试浮点数录入
        System.out.println("请输入一个浮点数：");
        double b = sc.nextDouble();
        System.out.println("你输入的浮点数是：" + b);
        //测试字符录入
        System.out.println("请输入一个字符：");
        char c = sc.next().charAt(0);
        System.out.println("你输入的字符是：" + c);
        //测试字符串录入
        System.out.println("请输入一个字符串：");
        String d = sc.next();
        System.out.println("你输入的字符串是：" + d);
        //测试布尔值录入
        System.out.println("请输入一个布尔值：");
        boolean e = sc.nextBoolean();
        System.out.println("你输入的布尔值是：" + e);
        //停
        System.out.println("请按回车键结束...");
        sc.nextLine();

    }
}

package plan.attack.ifdemo;

import java.util.Scanner;

public class IfDemo01 {
    //if语句实验
    public static void main(String[] args) {
        //输入体温，如果体温高于37度，则输出“发烧"
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体温：");
        double temp = sc.nextDouble();
        if (temp > 37) {
            System.out.println("发烧");
        }
        sc.close();
    }
}

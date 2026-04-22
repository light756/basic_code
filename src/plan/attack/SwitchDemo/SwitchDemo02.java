package plan.attack.SwitchDemo;

import java.util.Scanner;

public class SwitchDemo02 {
    static void main() {
        //switch语句实验(较新特性)
        //case:1\2\3->输出同一个
        //string s=switch(case)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        String s = switch(a){
            case 1,2,3 -> "进攻";
            case 4,5,6 -> "防御";
            case 7->"训练";
            default -> "其他";
        };
        System.out.println(s);
    }
}

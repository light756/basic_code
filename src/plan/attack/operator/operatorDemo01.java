package plan.attack.operator;

import java.util.Scanner;

public class operatorDemo01 {
    static void main() {
        //运算符小题
        //时间？秒，转换为时分秒
        //读取以秒为单位的时间
        Scanner sn = new Scanner(System.in);
        System.out.println("请输入时间（秒）：");
        int time = sn.nextInt();
        int hour = time / 3600;
        int minute = (time % 3600) / 60;
        int second = time % 60;
        System.out.println("时间转换结果为：" + hour + ":" + minute + ":" + second);
    }
}

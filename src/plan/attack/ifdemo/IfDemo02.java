package plan.attack.ifdemo;

import java.util.Scanner;

public class IfDemo02 {
    static void main() {
        //一个游戏
        //某游戏角色HP2000，上限为2000，受到的伤害为X，恢复值为Y，XY均来自键盘输入，生命值最低为1
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入X：");
        int x = sc.nextInt();
        System.out.println("请输入Y：");
        int y = sc.nextInt();
        int hp = 2000;
        hp = hp - x + y;
        if (hp < 1) {
            hp = 1;
        }
        if(hp > 2000) {
            hp = 2000;
        }
        System.out.println("当前生命值为：" + hp);
        System.out.println("游戏结束");
    }
}

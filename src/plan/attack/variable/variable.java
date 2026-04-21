package plan.attack.variable;

public class variable {
    static void main() {
    /*变量的使用实验*/
        /*一次回合制战斗甲乙对决 甲方先手，共计三回合
        甲方 攻击1100 防御500 组织度1000
        乙方 攻击400 防御200 组织都2000
        组织度伤害=敌攻击-己防御
        如果有人失败，退出循环，并宣布胜者一方当前状态*/
        int a_attack = 1100;
        int a_defense = 500;
        int a_organize = 1000;
        int b_attack = 400;
        int b_defense = 200;
        int b_organize = 2000;
        for (int i = 1; i <= 3; i++) {
            System.out.println("第" + i + "回合");
            a_organize -= b_attack - a_defense;
            System.out.println("甲方组织度:" + a_organize);
            b_organize -= a_attack - b_defense;
            System.out.println("乙方组织度:" + b_organize);
            if (a_organize <= 0) {
                System.out.println("乙方胜利");
                break;
            } else if (b_organize <= 0) {
                System.out.println("甲方胜利");
                break;
            }
        }
    }
}

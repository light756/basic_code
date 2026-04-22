package plan.attack.ifdemo;

import java.util.Scanner;

public class IfDemo03 {
    static void main() {
        //if语句实验——多层判断
        //假设有两家店铺，A家打8折
        //B家采用满减策略
        //50元满减5元
        //100元满减12元
        //200元满减30元
        //500元满减100元
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额：");
        double money = sc.nextDouble();
        //折扣金额，衡量和原价的差值
        double discountMoney_A = money * 0.2;
        double discountMoney_B = 0;
        if(money > 0){
            if(money < 50) discountMoney_B = 0;
            else if(money < 100) discountMoney_B = 5;
            else if(money < 200) discountMoney_B = 12;
            else if(money < 500) discountMoney_B = 30;
            else discountMoney_B = 150;
        }
        else{
            System.out.println("输入金额有误");
            return;
        }
        System.out.println("A家打8折，折扣金额为：" + discountMoney_A);
        System.out.println("B家采用满减策略，折扣金额为：" + discountMoney_B);
        if(discountMoney_A > discountMoney_B){
            System.out.println("A家打8折更优惠");
        }
        else if(discountMoney_A < discountMoney_B){
            System.out.println("B家采用满减策略更优惠");
        }
        else{
            System.out.println("两家店铺优惠相同");
        }
    }
}

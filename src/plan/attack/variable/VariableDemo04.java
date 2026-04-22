package plan.attack.variable;

public class VariableDemo04 {
    static void main(String[] args) {
        //这是一个进制转换实验，在此测试隐性进制转换和强制进制转换
        //向上兼容
        byte a = 50;
        byte b = 100;
        int c = a + b;
        System.out.println(c);
        //强行截断
        byte d = (byte)(a + b);
        System.out.println(d);
    }
}

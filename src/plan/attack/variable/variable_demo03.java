package plan.attack.variable;

public class variable_demo03 {
    public static void main(String[] args) {
        //加减乘除的测试（包括浮点）
        int a = 10;
        int b = 5;
        // 加
        System.out.println("a + b = " + (a + b));
        // 减                                                                                
        System.out.println("a - b = " + (a - b));
        // 乘
        System.out.println("a * b = " + (a * b));
        // 除
        System.out.println("a / b = " + (a / b));
        // 浮点数
        double f_a=1.0f;
        double f_b=0.3f;
        //乘
        System.out.println("f_a * f_b = " + (f_a * f_b));
        //除
        System.out.println("f_a / f_b = " + (f_a / f_b));
        //特别的，我希望进行保留两位小数的除法
        System.out.printf("%.2f\n",f_a / f_b);
        //为什么不能用println呢？告诉我，前面输出小数难道不都是使用println的吗？
        //因为println是输出字符串，而printf是格式化输出

    }
}

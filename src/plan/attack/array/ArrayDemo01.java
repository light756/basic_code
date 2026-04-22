package plan.attack.array;

public class ArrayDemo01 {
    //完整格式+简写格式的进行静态存储数组
    public static void main(String[] args) {
        //完整格式
        double[] arr=new double[]{1.4,1.2,1.3,1.45,1.2};
        for (double v : arr) {
            System.out.println(v);
        }
        //简写格式
        double[] arr1={1.4,1.2,1.3,1.45,1};
        for (double v : arr1) {
            System.out.println(v);
        }
    }
}

package plan.attack.array;

import java.util.Scanner;

public class ArrayDemo03 {
    public static void main(String[] args) {
        //数组实验——动态初始化
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("请输入第"+(i+1)+"个元素：");
            arr[i]=sc.nextInt();
            System.out.println("第"+(i+1)+"个元素是："+arr[i]);
        }
        for (int v : arr) {
            System.out.println(v);
        }
    }
}

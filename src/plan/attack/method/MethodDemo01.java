package plan.attack.method;

import java.util.Random;

public class MethodDemo01 {
    public static void main(String[] args) {
        //方法调用实验
        //随机生成25个数，这25个数取值范围是1-100
        //要求这25个数完全不重复
        //判定不重复的方法是封装一个返回值为boolean的方法
        int[] arr = new int[25];
        Random r = new Random();
        for (int i = 0; i < arr.length;) {
            int data = r.nextInt(100) + 1;
            if(!contains(arr,data)){
                arr[i] = data;
                i++;
            }
        }
        for (int j : arr) {
            System.out.println(j);
        }
    }
    public static boolean contains(int[] arr,int data){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                return true;
            }
        }
        return false;
    }
}

package plan.attack.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //本次实验旨在测试常规数组元素访问
        //以及尝试进行迭代器访问
        int[] arr={1,2,3,4,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int v : arr) {
            System.out.println(v);
        }
        //我要获取数组长度
        System.out.println(arr.length);
    }
}

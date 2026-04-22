package plan.attack.ForDemo;

public class ForDemo01 {
    //For循环实验
    static void main() {
        int sum=0;
        for(int i=1;i<=100;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("1到100的偶数和为：" + sum);
    }
}

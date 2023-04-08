package Exception;

import java.util.Scanner;

public class TestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入被除数：");

        if(sc.hasNextInt()){
            int n1 = sc.nextInt();
            System.out.print("请输入除数：");
            int n2 = sc.nextInt();
            if(n2 > 0){
                int result = n1 / n2;
                System.out.println("商是："+result);
            }else{
                System.out.println("除数不能为0！");
            }
        }else {
            System.out.println("输入的内容不是整数，请重新输入！");
        }
    }
}

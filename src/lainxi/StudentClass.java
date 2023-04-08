package lainxi;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入课程代号(1~3之间的数字):");
        int number = sc.nextInt();
        if (number<0 || number>4){
            System.out.println("数字输入错误，请重新1~3之间的整数！");
        }else {
            try {
                switch (number){
                    case 1:
                        System.out.println("C#编程\n欢迎提出建议！");
                        break;
                    case 2:
                        System.out.println("Java编程\n欢迎提出建议！");
                        break;
                    case 3:
                        System.out.println("C语言编程\n欢迎提出建议！");
                        break;
                }
            }catch (InputMismatchException e){
                e.printStackTrace();    //打印堆栈信息的方法打印异常信息
            }catch (Exception exception){
                exception.printStackTrace();
            }
        }

    }
}

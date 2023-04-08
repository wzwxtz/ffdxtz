package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestNum3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("请输入被除数：");
            int n1 = sc.nextInt();
            System.out.print("请输入除数：");
            int n2 = sc.nextInt();
            int result = n1 / n2;
            System.out.println("商是："+result);

            return;
        }catch (InputMismatchException e){
            e.printStackTrace();    //打印堆栈信息的方法打印异常信息

            System.exit(1); //强制退出（status是一个非0的数）
        }catch (ArithmeticException a){
            String message = a.getMessage();
            System.out.println(message);    //以字符串的形式打印异常
        }catch (Exception exception){
            exception.printStackTrace();
        }finally {
            System.out.println("谢谢使用！");
        }
    }
}

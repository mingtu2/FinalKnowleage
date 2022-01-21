package normal;

import java.util.Scanner;

/**
 * @author mingtu
 * @create 2022-01-16 22:26
 */
public class ScannerDemo {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入一个整数");
        int i = scanner.nextInt();
        if(i>5){
            System.out.println("你输入的数字大于5");
        }else{
            System.out.println("你输入的数字不大于5");
        }
    }
}

package July.ex_23.ex_30;

import java.util.Scanner;

public class Lab104 {
    public static void main(String[] args) {
        // program to find a largest three no

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no 1");
        int num1 = sc.nextInt();
        System.out.println("enter the no 2");
        int num2 = sc.nextInt();
        System.out.println("enter the no3");
        int num3 = sc.nextInt();

        if (num1> num2 && num1 > num3){
            System.out.println(num1);
        } else if (num2> num1 && num2> num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }
    }
}
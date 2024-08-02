package ex_30;

import java.util.Scanner;

public class Lab088 {
    public static void main(String[] args) {
        //Mac no in two inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no 1");
        int num1= sc.nextInt();

        System.out.println("Enter the no 2");
        int num2= sc.nextInt();


        if (num1>num2){
        System.out.println(num1);
        }

        else if (num2>num1){
            System.out.println(num2);

            }
        else {
            System.out.println("equal");
        }
    }
}

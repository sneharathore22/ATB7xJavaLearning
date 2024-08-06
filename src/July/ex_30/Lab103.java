package July.ex_30;

import java.util.Scanner;

public class Lab103 {
    public static void main(String[] args) {
        //Program to check
        //if no is positive
        // negative
        //or zero

        Scanner sc = new Scanner(System.in);
        System.out.println("enter your no");
        int num = sc.nextInt();


        if(num > 0) {
            System.out.println("positive no");
        } else if (num<0) {
            System.out.println("negative no");
        }else {
            System.out.println("zero");

    }
    }
}

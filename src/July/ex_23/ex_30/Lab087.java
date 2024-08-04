package July.ex_23.ex_30;

import java.util.Scanner;

public class Lab087 {
    public static void main(String[] args) {
        //Take user input and check if no is even or odd
        //Logic building ready
        //1. Figure out the input & data types
        //Data type - int
        //How to take input in the java - scanner -class
        //nextInt() -input
        //do we need conversion or directly
        //rough logic - num%2== 0 even or odd
        //optimize


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no");
        int user_input = sc.nextInt();

        System.out.println("Enter the no 2");
        int user_input_2 = sc.nextInt();

        System.out.println("user_input");
        System.out.println("user_input_2");


        if (user_input_2 %2==0)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }
    }
}

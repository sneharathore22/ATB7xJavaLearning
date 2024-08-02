package Practice;

import java.util.Scanner;

public class P006 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int user_num= sc.nextInt();

        System.out.println("enter the no 2");
        int user_num2= sc.nextInt();

        if(user_num2 %2==0){
            System.out.println("even");
        }
        else {
            System.out.println("odd");
        }
    }
}

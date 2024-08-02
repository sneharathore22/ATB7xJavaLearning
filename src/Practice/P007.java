package Practice;

import java.util.Scanner;
public class P007 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no");
        int num = sc.nextInt();


        System.out.println("enter the no");
        int num2 = sc.nextInt();

            if (num>=num2){
                System.out.println(num);
            } else if (num2>num)
            {
                    System.out.println(num2);
            }
            else {
                System.out.println("equal");
            }
    }
}


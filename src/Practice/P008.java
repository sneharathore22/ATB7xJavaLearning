package Practice;

import java.util.Scanner;
public class P008 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        System.out.println("enter the age");
        int age = sc.nextInt();

        if (age<=18)
        {
            System.out.println("Goa");
        } else if (age>=30)
        {
                System.out.println("Goa or Maldives");
        }
    }
}

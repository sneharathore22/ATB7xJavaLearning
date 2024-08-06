package July.ex_30;

import java.util.Scanner;

public class Lab101 {
    public static void main(String[] args) {
        //write a program name, age, salary - print it
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.next();

        System.out.println("enter your age");
        int age = sc.nextInt();

        System.out.println("enter your salary");
        double salary = sc.nextDouble();

        System.out.println("your details are " + name);
        System.out.println("your age are " + age);
        System.out.println("your salary are " + salary);

        sc.close();
    }
}

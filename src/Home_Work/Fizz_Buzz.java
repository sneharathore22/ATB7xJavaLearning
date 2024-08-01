package Home_Work;

import java.util.Scanner;

public class Fizz_Buzz {
    public static void main(String[] args) {
     //   Write a program that prints numbers from 1 to 100. However, for multiples of 3,
        //   print "Fizz" instead of the number, and for multiples of 5, print "Buzz."
        //   For numbers that are multiples of both 3 and 5, print "FizzBuzz."


      Scanner sc= new Scanner(System.in);
        for (int i= 1; 1<=100; i++){
            if (i%3==0 && i%5==0)
            {
                System.out.println("FizzBuss");
            }
            else if (i%3==0)
            {
                    System.out.println("Fizz");
            }
            else if (i%5==0)
            {
                    System.out.println("Buzz");
            }

                else
            {
                System.out.println(i);
            }
        }


    }
}

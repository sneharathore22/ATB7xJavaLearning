package ex_30;

import java.util.Scanner;

public class Lab094 {
    public static void main(String[] args) {
        // Take a user input as char and tell the user if it is a vowel
        //a,e,i,o,u


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell you,if it is a vowel of not!");
        char user_input = sc.next().charAt(0);
        System.out.println(user_input);

        switch (user_input){
            case 'a':
                System.out.println("its a vowel");
                break;
            case 'e':
                System.out.println("its a vowel");
                break;
            case 'i':
                System.out.println("its a vowel");
                break;
            case 'o':
                System.out.println("its a vowel");
                break;
            case 'u':
                System.out.println("its a vowelj");
            default:
                System.out.println("It's not a vowel, Its a consonent");

                    //we can also do this is shot

                switch (user_input){
                    case 'a','e','i','o','u':
                        System.out.println("vowel");
                        break;
                        default:
                            System.out.println("its not vowel");

                }
        }
    }
}

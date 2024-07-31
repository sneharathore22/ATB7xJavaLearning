package ex_30;

import java.util.Scanner;

public class Lab090 {
    public static void main(String[] args) {

        //Grade Cal
        //Calculate and display the letter grade for a
        // given numerical score(eg. A,B,C,D or F)
        // A:90-100
        //B:80-89
        //C:70-79
        //D:60-69
        //E:0:59


        //1.Find the user input
        //score- data type ? int -90
        //return -> grade - data type - char - A
        // DAA - Ask for the confirmation of the doubts
        //interviewer -> int, char
        //Scanner ->

        //2.Basic Logic
        //if (score>=90 && score<=100) ->   return or print grade - A
        //else if score <= 89 && score >= 80 -> return or print grade - B1
        //else if score <= 79 && score >= 70 -> return or print grade - C
        //else if score <= 69 && score >= 60 -> return or print grade - D
        // else -> grade -> F


        //3. Write the code

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the student score");
        int score = sc.nextInt();

        char grade = 'F';

        if (score>=90 && score <= 100)
        {
            grade ='A';

        } else if (score>=80 && score<89)
        {
            grade ='B';
        } else if (score>=70 && score<79)
        {
            grade = 'C';
        }else if (score>=60 && score<69)
        {
            grade = 'D';
        }else if (score<=0 || score>100)
        {
            System.out.println("Lol!!, are you god");
            grade ='F';
        }else
        {
            grade ='F';
        }

        System.out.println("your grade is ->"+grade);
            sc.close();

    }
}

package ex_0308;

import java.util.Scanner;

public class Lab147 {
    public static void main(String[] args) {

        //where we take the user input of the 5 subject - avg of the subject.

        // Interview Question
        //Functions -? stack
        // Figure inouts - float,scanner class

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        for (int i = 0; i < marks.length; i++) {

            System.out.println("enter the marks of the sub" + (i + 1));
            marks[i] = sc.nextFloat();

            float avg =(marks[0]+marks[1]+marks[2]+marks[3]+marks[4])/5;
            System.out.println("Avg is ->"+avg);
        }

    }
}

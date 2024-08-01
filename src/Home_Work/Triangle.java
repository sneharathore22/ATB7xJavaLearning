package Home_Work;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        // Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides, determine
        // if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or
        // scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        // side1, side2, side3 ->


        Scanner sc = new Scanner(System.in);
        System.out.println("enter the side");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();


        if (side1 == side2 && side2==side3){
            System.out.println("equilateral");
        } else if (side1 == side2 || side1 == side3 || side2 == side3) {

            System.out.println("isosceles");
        }
        else
        {
            System.out.println("scalene");
        }


    }
}

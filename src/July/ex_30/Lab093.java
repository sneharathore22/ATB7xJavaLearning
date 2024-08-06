package July.ex_30;

import java.util.Scanner;

public class Lab093 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day from 1 to 7, tell what that it is" );
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thus");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
            default:
                System.out.println("no idea system it is");
        }
    }
}

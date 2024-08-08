package August.ex_0108.ex_0308;

import java.util.Scanner;

public class Lab139 {
    public static void main(String[] args) {

        int[] marks = new int[3];
        // index -0,1,3
        //len - 3

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 88;
        marks[2] = 98;

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //System.out.println(marks[10]);

        boolean[] is_married = {true, false, true};

        for (int i = 0; i < marks.length; i++) {
            System.out.println(i + "-> " + marks[i]);
        }

        String weekDays[] = {"Sunday", "Monday", "Tuesday", "Wednesday"};
        for (int i = 0; i < weekDays.length; i++) ;
        {
            int i = 0;
            System.out.println(weekDays[i]);
        }

    }
}

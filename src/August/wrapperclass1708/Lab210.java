package August.wrapperclass1708;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab210 {
    public static void main(String[] args) {
            //Exception
            // Checked - JVM knows
 //       try {
 //           FileInputStream file = new FileInputStream("C://log.txt");
 //       } catch (FileNotFoundException e){
 //           throw new RuntimeException(e);
 //       }



        //unchecked
        try {
            int a = 10;
            int c = a/0;
            System.out.println("c");
        } catch (Exception e) {
            System.out.println("Error div by Zero");
        }

            System.out.println("End of the program");
    }
}

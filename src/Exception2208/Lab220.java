package Exception2208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab220 {
    public static void main(String[] args)throws FileNotFoundException,ArithmeticException{
        readFile();
    }

    private static void readFile()throws FileNotFoundException,ArithmeticException {
        System.out.println("Hi Sneha");
        String path = "/Users/HP/Downloads/Ad1.mp4";
        File file = new File(path);
        FileReader fileReader = new FileReader(file);

        // read the file txt it can read the file
            System.out.println("End of the program");

             }

    }



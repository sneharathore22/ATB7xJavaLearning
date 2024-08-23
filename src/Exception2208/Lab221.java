package Exception2208;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab221 {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException| NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("e1");

//            throw new RuntimeException(e);
        } catch (Exception e2) {

            System.out.println("e2");

        }finally {

            System.out.println("FF");

        }
            FileReader f = new FileReader(new File("c://a.txt"));
        }
    }


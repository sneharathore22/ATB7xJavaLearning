package ex_29;

public class Lab074 {
    public static void main(String[] args) {
        String name = "The Testing Academy";
        String name1 = "The Testing Academy";

        String name2 = new String("The Testing Academy");       //heap area
        String name3 = new String("The Testing Academy");       //heap area
        // System.out.println(name == name1);       Check for the ref
        // System.out.println(name.equals(name1));       Check for the check for the contant

        System.out.println(name1 == name2);
        // System.out.println(name == name1);       Check for the ref
           System.out.println(name1.equals(name2));  //     Check for the ref

    }
}

package July.ex_29;

public class Lab075 {
    public static void main(String[] args) {
        String s1 = new String("Sneha");
        String s2 = new String("Sneha");
       String s3 = new String("Sneha");

       System.out.println(s1 == s2);            // Check for the ref
       System.out.println(s2 ==s3);             // Check for the ref
        System.out.println(s2.equals(s3));      // Check for the Contant

    }
}

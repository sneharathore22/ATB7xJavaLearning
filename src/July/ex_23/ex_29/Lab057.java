package July.ex_23.ex_29;

public class Lab057 {
    public static void main(String[] args) {
        long phone_no =7073646374l;
        //short s = phone_no;   //Implicit Narrowing -JVM ?
        short s = (short) phone_no;
        System.out.println(s);
    }
}

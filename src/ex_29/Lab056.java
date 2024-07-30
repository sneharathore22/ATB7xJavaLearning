package ex_29;

public class Lab056 {
    public static void main(String[] args) {
        //Type Casting - Source and Destination conversion
        //Widening Implicit, Explicit - Lossless
        //Narrowing Implicit, Explicit(with data type), Loss


        //Widening
        byte b =10;
        int a = b;      //Valid - Implicit Casting - JVM
        int a1 =(int)b; // Valid Explicit Casting
        System.out.println(a1);


        //Narrowing
        int val = 300;
        //byte b1 =val; // IbValid -Implicit Casting -JVM
        byte b1 = (byte)val; //Invalid - Explicit Casting - // Loss of data
        System.out.println(b1);
    }
}

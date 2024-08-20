package August.wrapperclass1708;

public class Lab199 {
    public static void main(String[] args) {
        A a = new A();
        A a2 = new A();


        a.age = 12;
        System.out.println(A.discount);
        a.m2();
        A.m1();         //Static

        //Static doesn't need object ref = true or false
    }
}

    class A{
        int age = 10;       //Instance variable
        static int discount =199;
        static {
            System.out.println("One Time Load SIB");

        }
        {
            System.out.println("IIB when object is created");
        }
        static void m1(){
            System.out.println("m1");
        }
        void m2(){
            System.out.println("m2");
            System.out.println(discount );
        }
    }


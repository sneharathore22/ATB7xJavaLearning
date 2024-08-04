package July.ex_23.ex_29;

public class Lab064 {
    public static void main(String[] args) {
        int a =10;
        System.out.println(++a + ++a);
        System.out.println(a);
        // A -> ++a, Exp =11 / a =11
        //+ -> nothing
        //B -> ++a, Exp = 12 / a =
        //Exp =A+B =23, a = 12
    }
}

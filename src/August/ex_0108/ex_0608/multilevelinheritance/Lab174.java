package August.ex_0108.ex_0608.multilevelinheritance;

public class Lab174 {
    public static void main(String[] args) {
        //Multi Level
        //GF -> F -> Son
        Son s1 = new Son();
        s1.home();      //If name is same C-> F-> GF
        s1.s();
        s1.gf();
        s1.f();
    }
}

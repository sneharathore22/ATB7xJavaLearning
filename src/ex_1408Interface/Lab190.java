package ex_1408Interface;

public class Lab190 {
    public static void main(String[] args) {
        //I i = new I();
    }
}

interface I{}
class A{}   //con
class B{}
abstract class c{}
class Test1 extends A{}     //OK?
class Test2 extends B{}     //OK?
//class Test3 extends A,B{}       //Multiple Inhertiance
class Test0 implements I{}
interface I1{}
interface I2{}
class Test4 implements I1,I2{}      //multiple Inheritance with interface
class Test5 extends A implements I1,I2{}        //OK
//class Test6 Implements I1 extends A{}         //OK
//interface I3 extends A{}
//interface I4 implements A{}
//interface I5 extends A,B{}
interface I6 extends I1,I2{}
//interface I7 extends C{}



package August.ex_0108.superthiskeyword;

public class Lab185 {

}
    class Person1 {
        Person1() {
        System.out.println("Person1-DC");
        }

            Person1(String a){
            System.out.println("Person1-Pc A1");
        }

            Person1(String a,int a1){
            System.out.println("Person1-Pc A2");
        }
    }

        class Student1 extends Person1{
            int a = 10;
            Student1(String s){
            System.out.println("PC -Student");
        }

            Student1(){
             super();
             System.out.println(this.a);

            //    super("Sneha");
           //    super("sneha",12);
                  }


    }
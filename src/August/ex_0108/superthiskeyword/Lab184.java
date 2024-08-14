package August.ex_0108.superthiskeyword;

public class Lab184 {

}

class Student extends Person{
    //is a relation inheritance
    @Override
        void message(){
        System.out.println("I'm student message");
    }
    void display(){
        super.message();
    }


}

class Person{
    void message(){
        System.out.println("I'm person message");
    }
}

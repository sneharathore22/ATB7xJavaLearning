package ex_0408;

public class Animal {

    String name;
    String color;


    void walk(){}
    void talk(){}

    public static void main(String[] args) {
        Animal animalRef = null;
        Animal animalRef2 = new Animal();
        Animal animalRef3 = new Animal();
        Animal animalRef4 = animalRef2;
    }
}

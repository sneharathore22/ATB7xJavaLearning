package August.ex_0108.methodoveridding;

public class Lab182 {
    //methodoveriding / Runtime Poly

    public static void main(String[] args) {
        Hound h1 = new Hound();
        h1.bark();

        dog d1 = new dog();
        d1.bark();

        dog dog_ref = new Hound();
        dog_ref.bark();
    }

}

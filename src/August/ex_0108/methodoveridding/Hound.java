package August.ex_0108.methodoveridding;

public class Hound extends dog {
    int age =10;

  //  void bark() {
  //      System.out.println("I'm Dog, I'll bark");

        @Override
        void bark() {
            System.out.println("I'm Hound, I'll bark");

        }
    }



package ex_1408Interface;

public class WagonR implements Enginee{

    void drive(){
        startEnginee();
        stopEnginee();
    }
    @Override
    public void startEnginee() {
        System.out.println("Wagon R i starting");
    }

    @Override
    public void stopEnginee() {
        System.out.println("Wagon R i stopping ");

    }
}

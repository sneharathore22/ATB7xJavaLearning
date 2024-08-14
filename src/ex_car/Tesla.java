package ex_car;

public class Tesla extends Engine {
   // public static void main(String[] args) {
        void drive(){
            openCar();
            start();
            partGearBox();
            stop();

        }

    @Override
    void start() {
        System.out.println("Starting Tesla");
    }

    @Override
    void stop() {
        System.out.println("Stop the Tesla");
    }

    @Override
    void speed() {
        System.out.println("300Km.hr");

    }

    @Override
    void partGearBox() {
             System.out.println("Electric");

    }

    @Override
    void openCar() {
        System.out.println("Open Tesla");
    }
}



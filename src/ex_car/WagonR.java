package ex_car;

public class WagonR extends Engine {

    void drive(){
        openCar();
        start();
        partGearBox();
        speed();
        stop();

    }


    @Override
    void start() {

        System.out.println("Starting the Wagon R");

    }

    @Override
    void stop() {

        System.out.println("Stop the Wagon R");

    }

    @Override
    void speed() {

        System.out.println("100Km");

    }

    @Override
    void partGearBox() {

        System.out.println("Wagon/Hr");

    }

    @Override
    void openCar() {

        System.out.println("OpenKeys");

    }
}

package August.ex_0108.superthiskeyword;

public class Lab183 {
    //super()
    //1. Use of super with Variables
    //2. Methods
    //3. Constructors

    public static void main(String[] args) {
        Car s = new Car();
        s.display();
    }


    }

    class Car extends Vehichle {
        private int maxSpeed = 281;

        Car(){
            super(10);
            System.out.println("DC Car");
        }

     public void display() {
            System.out.println("car speed ->" + this.maxSpeed);
            System.out.println("Vehichle car speed ->" + super.maxSpeed);
            super.message();
            this.message();

        }
            @Override
             void message() {
             System.out.println("hello vehichle");

    }

    class Vehichle {
        public int maxSpeed = 180;

        void message() {
            System.out.println("hello vehichle");
        }



        void message(int a) {
            System.out.println("hello vehichle");
        }
    }
}



    //    public int getMaxSpeed() {
    //        return maxSpeed;
    //    }

    //        public void setMaxSpeed(int maxSpeed) {
    //        this.maxSpeed = maxSpeed;
    //    }
    //      }


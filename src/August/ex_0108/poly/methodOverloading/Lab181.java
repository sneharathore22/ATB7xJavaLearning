package August.ex_0108.poly.methodOverloading;

public class Lab181 {
    //Polymorphism

    public static void main(String[] args) {
        MathOperations mathOperations =new MathOperations();
        int result= mathOperations.add(2,3);
        double result2= mathOperations.add_double(2.4,3.6);
        String result3 = mathOperations.add("Sneha","Rathore");
        String result4 = mathOperations.add("Sneha",123);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}

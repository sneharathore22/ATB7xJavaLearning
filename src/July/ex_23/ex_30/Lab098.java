package July.ex_23.ex_30;

public class Lab098 {
    public static void main(String[] args) {
        //JDK >13

        int itemcode =001;

        switch (itemcode){
            case 001 -> System.out.println("it is a laptop");
            case 002 -> System.out.println("it is a desktop");
            case 003,004 -> System.out.println("it is a mob phone");
            default -> System.out.println("helooo");
        }
    }
}

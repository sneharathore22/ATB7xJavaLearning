package ex_30;

public class Lab097 {
    public static void main(String[] args) {
                //JDK > 13
                    // multiple condition
        int itemcode = 007;
        switch (itemcode){
            case 001,002,003:
                System.out.println("it is an electronic gadget");
                break;
            case 004,005,006:
                System.out.println("it is a machine gadget");
        //        break;
            default:
                System.out.println("None");

        }
    }
}

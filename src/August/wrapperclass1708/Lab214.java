package August.wrapperclass1708;

public class Lab214 {
    public static void main(String[] args) {

        try {
            int a = 10/0;
        } catch (Exception e) {
            System.out.println("Div by zero");
        } finally {
            System.out.println("I'll be always Executed, anyHow!!!");
        }
    }
}

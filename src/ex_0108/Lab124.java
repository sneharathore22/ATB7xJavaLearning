package ex_0108;

public class Lab124 {
    public static void main(String[] args) {

        int i = 0;
        for (i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Even->" + i);
                continue;
            }
            System.out.println("Odd->" + i);
        }
    }
}
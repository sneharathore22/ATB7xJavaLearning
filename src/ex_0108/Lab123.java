package ex_0108;

public class Lab123 {
    public static void main(String[] args) {
        for(int i=0;i<=50;i++){
            if(i%2==0){
                System.out.println("Even->" + i);
                continue;
            }
            else {
                System.out.println("Odd->" + i);
            }
        }
    }
}

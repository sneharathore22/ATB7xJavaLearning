package August.ex_0108.Encapsulation;

public class Lab180 {
    public static void main(String[] args) {

        ICICIBank sneha= new ICICIBank("Sneha",100);
            //set the balance
           //admin

            sneha.setBal(10000000, false);
            System.out.println(sneha.getName());
            System.out.println(sneha.getBal());

            ICICIBank admin =new ICICIBank("admin",1000);
            admin.setBal(5000,true);
            System.out.println(admin.getName());
            System.out.println(admin.getBal());
    }
}

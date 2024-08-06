package ex_0608;

public class Lab166 {
    public static void main(String[] args) {
        String nameGiven = "Sneha";
        ATBPerson p1 = new ATBPerson(nameGiven="Sneha");
        p1.name ="Sneha";

        System.out.println(p1.name);
        System.out.println(p1.phone);

        ATBPerson p2 = new ATBPerson();
    }
}

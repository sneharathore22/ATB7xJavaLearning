package ex_0408;

public class Lab158 {
        //ClassName Object_ref=Object() -> ( new ClassName())
        //Class -> blueprint -Attribute,Behv,-Not Real (blueprint)
        //Object-> Real Entites -> Class -A, Behv => functions

    public static void main(String[] args) {
            Bank bank1 =new Bank();
            Bank bank2 =new Bank();

            bank1.name ="SBI";
            bank2.name ="ICICI";


            System.out.println(bank1.name);
            System.out.println(bank2.name);
            System.out.println(bank2.balance);

            bank2.balance = 100;
            System.out.println(bank2.balance);
            System.out.println(bank1.balance);
    }
}

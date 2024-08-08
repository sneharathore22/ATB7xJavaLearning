package August.ex_0108.ex_0608;

public class ATBPerson {

    String name;
    long phone;

    //DC
    ATBPerson() {
        System.out.println("Object is created");
    }

    ATBPerson(String nameGiven) {
        this.name = nameGiven;
    }

    ATBPerson(String nameGiven, String phone) {
        this.name = nameGiven;
    }
}

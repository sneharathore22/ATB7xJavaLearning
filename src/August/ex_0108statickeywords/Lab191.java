package August.ex_0108statickeywords;

public class Lab191 {
    //Static
    //Block
    //Data Member
    //Function
    //Class

    public static void main(String[] args) {
        ATB a1 = new ATB("Shuchi");
        System.out.println(a1.getName());



        ATB a2 =new ATB("Sneha");
        System.out.println(a2.getName());
        ATB.doAssignment();
        System.out.println(ATB.courseName);

    }
}


class ATB{

    private String name;
    static String courseName = "ATB";

    public ATB(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static void doAssignment(){
        System.out.println("doAssignment");
    }
}

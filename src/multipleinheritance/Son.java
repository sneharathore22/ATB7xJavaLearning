package multipleinheritance;

public class Son implements Father,Mother {

    @Override
    public void money() {
        System.out.println("This is Only One Function");
    }

    @Override
    public void home() {

    }
}

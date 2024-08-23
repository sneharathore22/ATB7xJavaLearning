package Exception2208;

public class Lab226 extends Object {
    public static void main(String[] args) {
        String name = "Sneha";
        String name2 = "sneha";
        if(name.equalsIgnoreCase(name2)){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }

        //final -> constant
        //finally -> block of code with the try and catch
        //finalize -> Object class function - threading use case
    }
}

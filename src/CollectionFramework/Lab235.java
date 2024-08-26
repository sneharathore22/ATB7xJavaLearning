package CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Lab235 {
    public static void main(String[] args) {
        List mylist1 = new ArrayList();
        mylist1.add("Shuchi");
        mylist1.add("Vishu");
        mylist1.add("Sneha");
        System.out.println(mylist1);

        Vector v = new Vector();
      //  Vector v = new Vector();
        v.add("Shuchi");
        v.add("Sneha");
        v.add("Vishu");
        System.out.println(v);

    }
}

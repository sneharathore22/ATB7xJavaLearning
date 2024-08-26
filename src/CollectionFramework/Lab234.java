package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab234 {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Sneha");
        mylist.add("Ram");
        mylist.add("Vishu");

        System.out.println("- To Print ArrayList - 1 ");

        for (String str : mylist){
            System.out.println(str);
        }

        System.out.println("- To Print ArrayList - 2 ");

        for (int i =0; i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }

        System.out.println("- To Print ArrayList - 3 ");

        //Iterator
        Iterator<String>its = mylist.iterator();
        while (its.hasNext()){
            System.out.println(its.next());
        }
    }
}

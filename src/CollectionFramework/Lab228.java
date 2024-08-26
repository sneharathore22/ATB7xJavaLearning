package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Lab228 {
    public static void main(String[] args) {
        //CollectionFramework
        //Collection - Interface
        //Collection(I) -> List(I)
        //List (I) -> ArrayList, LinkedList, Vector,Stack

        //Shoppin List, Marks List, Collection of Items, Todo List, Student List.
//        Collection mylist3 = new ArrayList();   //Dynamic Dispatch
//        List mylist = new ArrayList();      //Dynamic Dispatch


        ArrayList mylist2 = new ArrayList();
        mylist2.add("Sneha");
        mylist2.add("Shuchi");
        mylist2.add("Ram");
        mylist2.add("Tilak");
        mylist2.add(123);
        mylist2.add(true);

        System.out.println(mylist2);               //[Sneha,Shuchi,Ram,Tilak]
        System.out.println(mylist2.size());        //4
        System.out.println(mylist2.contains("Ram"));
        System.out.println(mylist2.contains("Tilak"));
        System.out.println(mylist2.contains("Ajay"));
        String s1 = (String) mylist2.get(1);
        System.out.println(s1);




    }
}

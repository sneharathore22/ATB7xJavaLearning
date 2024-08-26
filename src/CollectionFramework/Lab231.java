package CollectionFramework;

import java.util.ArrayList;

public class Lab231 {
    public static void main(String[] args) {
        ArrayList mylist = new ArrayList();
        mylist.add("Shuchi");
        mylist.add("Sneha");
        mylist.add("Suchi");
        mylist.add("Ram");
        mylist.add("Tilak");

        //add,remove,clear,container,indexOf,isEmpty, size,get
        //addAll, removeAll,retainAll,containAll

        System.out.println(mylist);
        System.out.println(mylist.size());
        mylist.remove("Suchi");
        //Removes the first occurrence of the specified element from this list,
        System.out.println(mylist);
 //       mylist.clear();
   //     System.out.println(mylist);
    //    System.out.println(mylist.isEmpty());
        System.out.println(mylist);

        mylist.add("Rathore");
        System.out.println(mylist);
        mylist.add("Vishu");
        System.out.println(mylist);
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);

        //how to print?

        for(int i =0; i<mylist.size();i++){
            System.out.println(mylist.get(i));
        }

    }
}

package CollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lab232 {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add(91);
        marks.add(92);
        marks.add(95);
        marks.add(87);
        marks.add(97);
        System.out.println(marks);

        Collections.sort(marks);
        System.out.println(marks);

    }
}

package collections;

import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {

     public static void main(String[] args) {

     List<Integer> al = Arrays.asList(12,3,5,6,7,85,8,9);
     System.out.println("before sort "+al);

     Collections.sort(al,new Comparator<Integer>() {

     @Override
     public int compare(Integer o1, Integer o2) {

       return 0;
    }
   });

    System.out.println("after sort "+al);

      int i = Collections.binarySearch(al, 6);
       System.out.println(i);

       Collections.reverse(al);
       System.out.println("reverse "+al);

       Iterator<Integer> iterator = al.iterator();

      while(iterator.hasNext()) {
    System.out.println(iterator.next());
    }

   ListIterator<Integer> li = Arrays.asList(1,2,3,4,5,6).listIterator();
   System.out.println("next "+li.next());
   System.out.println("next "+li.next());
   System.out.println("next "+li.next());
   System.out.println("pre "+li.previous());
   System.out.println("pre "+li.previous());

   }

}

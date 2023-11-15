package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class TestArrayList {
    public static void main(String args[]){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(54);
        al.add(12);

        System.out.println("Display ArrayList: ");
        for(int i: al){
            System.out.println(i);
        }

        System.out.println("Display ArrayList with Iterators");

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("Reverse List:");
        ListIterator<Integer> it6=al.listIterator(al.size());
        while(it6.hasPrevious())
        {
            System.out.println(it6.previous());
        }

        System.out.println("3rd Element is: "+al.get(2));

        //update element
        al.set(3,452);
        //remove element
        al.remove(1);

        Iterator<Integer> it2 = al.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

        //sorting arraylist
        Collections.sort(al);

        System.out.println("Sorted ArrayList: ");
        Iterator<Integer> it3 = al.iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }

        System.out.printf("\n\nArrayList Size: "+al.size());
        al.clear(); // ArrayList will be empty
        System.out.printf("\n\nAfter clear, ArrayList Size: "+al.size());
        System.out.println(al.size());

    }

}

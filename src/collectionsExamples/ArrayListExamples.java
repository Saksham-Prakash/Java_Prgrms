package collectionsExamples;

import java.util.*;

public class ArrayListExamples {
    public static void main(String[] args) {
        List<Integer> l1= new ArrayList<>();
        l1.add(1);
        l1.add(2);// inserts the element at the end and returns a boolean value
        l1.add(2);
        l1.add(0,4);//insert at index

        List<Integer> l2= new ArrayList<>();
        l2.add(9);
        l2.add(8);

        List<Integer> l3= new ArrayList<>(l2);
        l3.add(4);
        l3.addAll(l1);/*It is used to append all the elements in the specified collection, starting at the specified position of the list.*/

        l1.clear();  //It is used to remove all of the elements from this list.
        System.out.println(l3);
        System.out.println(l2.get(0));
        System.out.println(l1.isEmpty());

        Iterator itr=l3.iterator();//getting the Iterator
        while(itr.hasNext()){//check if iterator has the elements
            System.out.println(itr.next());
        }

        System.out.println(l3.lastIndexOf(0));
        l2.toArray();

        Collections.sort(l3);
        System.out.println(l3);



    }
}

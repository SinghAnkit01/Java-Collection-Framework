// import java.util.ArrayList;
import java.util.LinkedList;
// import java.util.List;
// import java.util.Iterator;
import java.util.List;

// import java.util.Scanner;

public class ListLinkedList {
    public static void main(String[] args) {
        System.out.println("ArrayList exmple...");
        // Working of arraylist
        // simple array in java cant add dynamic values to array variable;
        // for adding dynamic values we have to use ArrayList class.
        // implementation

        // ArrayList<String> sn = new ArrayList<>();
        // sn.add("ankit");
        // sn.add("ankit");
        // sn.add("ankit");
        // sn.add("ankit");
        // sn.add("ankit");
        // System.out.println(sn);

        List<Integer> list = new LinkedList<>();
        // List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        // // list.add(100);................method
        // // System.out.println(list);

        // // at particular index;
        // // .add(0,12)
        // // list.add(2,1000);................method
        // // System.out.println("after adding value at particular index"+list);

        // // addAll() adding two list together

        // ArrayList<Integer> newlist = new ArrayList<>();
        // newlist.add(2000);
        // newlist.add(3000);
        // newlist.add(4000);

        // System.out.println(newlist);

        // list.addAll(newlist);....................method
        // System.out.println(list);
        // System.out.println(newlist);

        // int a = list.size();....................method
        // System.out.println("Size of list"+" "+a);
        // size is not a zero index system like array.

        // list.contains().............................method
        // if (list.contains(100)) {
        //     System.out.println("100 is present");
        // } else {
        //     System.out.println("100 is not present");
        // }

        // int b = (list.get(2));.....................method
        //     System.out.println("Accessing value of list with the help list.get method"+" "+b);

        // remove values from list
        //  System.out.println("Before applying remove function"+" "+list);
        
        //  list.remove(2);.....................method

        //  System.out.println("Afterapplying remove function"+" "+list);

        //  System.out.println("Before applying remove type integer function"+" "+list);

        //  list.remove(Integer.valueOf(60));................method

        //  System.out.println("after applying remove type integer function"+" "+list);   

        // list.set(0, 10);........................method
        // System.out.println("After adding value at 0th index"+" "+list);

        // 3 methods to iterate a given list
        // int a = list.size();
            // for(int i=0;i<6;i++)
            // {
            //     System.out.println("First Method to iterate"+" "+list.get(i));
            // }

            // 2nd method for iterating
            // for(Integer element:list)
            // {
            //     System.out.println("Second method to iterate"+" "+element);
            // }

            // 3rd method for iterating

            // Iterator<Integer> it = list.iterator();
            // while (it.hasNext()) {
            //     System.out.println("Third method to iterate"+" "+it.next());
                
            // }

    }
}


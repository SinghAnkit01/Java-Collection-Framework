import java.util.Set;
import java.util.LinkedHashSet;
public class LinkedHashset{
    public static void main(String[] args) {
        // hashset is a class of set interface which means we can use all the methods of set interface in this class.
        Set<Integer> set  = new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        System.out.println(set);
        // after printing you wil see order will be defined in LinkedHashSet datastructure.
        // elements wii print in same order as mentioned by developer.
        // main difference between HashSet and LinkedHashSet.
        // Methods of set
        set.remove(10);
        System.out.println(set);
        System.out.println( set.contains(200));
        // this returns boolean value if value presents returns return true otherwise returns false.
        System.out.println(set.isEmpty());
        // this returns boolean value if set is empty returns return true otherwise returns false.
        System.out.println(set.size());
        // returns size of set 
        set.clear();
        System.out.println(set);
       
    }
}


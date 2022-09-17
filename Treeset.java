import java.util.Set;
import java.util.TreeSet;
public class Treeset{
    public static void main(String[] args) {
        // hashset is a class of set interface which means we can use all the methods of set interface in this class.
        Set<Integer> set  = new TreeSet<>();
        set.add(1000);
        set.add(20);
        set.add(2);
        set.add(6);
        set.add(90);
        System.out.println(set);
        // after printing you wil see order will be defined in TreeSet datastructure but along with order sorting wil be done of set.
        // elements will be placed according to ascending order.
        // main difference between TreeSet,HashSet and LinkedHashSet.
        // Methods of set
        set.remove(10);
        System.out.println(set);
        System.out.println( set.contains(1000));
        // this returns boolean value if value presents returns return true otherwise returns false.
        System.out.println(set.isEmpty());
        // this returns boolean value if set is empty returns return true otherwise returns false.
        System.out.println(set.size());
        // returns size of set 
        set.clear();
        System.out.println(set);
       
    }
}



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class collectionclass {
    public static void main(String[] args) {
    List<Integer> sn = new ArrayList<>();
    sn.add(55);
    sn.add(55);
    sn.add(55);
    sn.add(55);
    sn.add(515);
    sn.add(5515);
    sn.add(55888);
    sn.add(5581818);
    
    // System.out.println(sn); 
    // 1 operation
    System.out.println( Collections.min(sn));
    // print minimum value from sn list
    System.out.println( Collections.max(sn));
    // print maximum value from sn list
    System.out.println(Collections.frequency(sn, 55));
    // how many time 55 is present
    Collections.sort(sn);
    System.out.println(sn);
    // sorting will be done in ascending order
    Collections.sort(sn,Comparator.reverseOrder());
    System.out.println(sn);
    // sorting will be done in descending order

    
   
    }

   
}

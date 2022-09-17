import java.util.TreeMap;
import java.util.Map;

public class Treemap {
    public static void main(String[] args) {
    Map<String,Integer> number = new TreeMap<>();
        number.put("one", 1);
        number.put("two", 2);
        number.put("three", 3);
        number.put("four", 4);
        number.put("five", 4);
        System.out.println(number);
       // wont be enter according to HashMap;
        number.put("one", 4);
        // it will update the given key as mentioned value 
        number.put("one", 41);
        // for prevent updating of key
        // method 1 to update key
        number.putIfAbsent("two", 55);
        // but four is present it wont be add.
        //   method 2 to update key
          if(!number.containsKey("one")){
            number.put("one", 45);
        //   }
        System.out.println(number.containsKey("one"));
        // output:true
        System.out.println(number.containsValue(87)); 
         // output:false
        System.out.println(number.isEmpty()); 
        //  output:false
        System.out.println(number.remove("one"));
        System.out.println(number);
        // output:{four=4, two=2, three=3}



        // iterate a map....
        // 1 Method)iterting both key and values
        for(Map.Entry<String,Integer> e:number.entrySet()){
            // e used to store valus after iteration
            // number is a variable used to store key value as mentioned earlier.
            System.out.println(e);
        }
         // 2 Method)iterting only keys
         for(String key : number.keySet()){
            System.out.println(key);
         }
        //  2 Method)iterting only values
         for(Integer value : number.values()){
            System.out.println(value);
         }
        }


        
    }
}
    






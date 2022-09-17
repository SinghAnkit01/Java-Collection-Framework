import java.util.LinkedList;
// import java.util.PriorityQueue;
import java.util.Queue;

public class QueueLinkedList {
    public static void main(String[] args) {
        // Queue does not contain class like Queue it contains class like LinkedList, PriorityQueue.
        Queue<String> animals = new LinkedList<>();
        // class LinkedList has beed implemented by Queue interface.
        // offer() and add() both working are same but offer() returns null if queue is empty but add() returns exception
        // if queue is empty thats why we use offer() instead of add().
        animals.offer("ant");
        animals.offer("cat");
        animals.offer("elephant");
        animals.offer("dog");
        animals.add("snake");
        System.err.println(animals);

        // animals.peek();
        System.out.println(animals.peek());

        // poll() and remove() both working are same but poll() returns null if queue is empty but remove() returns exception
        // if queue is empty thats why we use poll() instead of remove().
        animals.poll();
        System.out.println(animals);    
       // animals.peek();
        System.out.println(animals.peek());
        animals.remove();
        System.out.println(animals);

        // peek() and element() both working are same but peek() returns null if queue is empty but element() returns exception
        // if queue is empty thats why we use peek() instead of element().

        System.out.println(animals.peek());
        System.out.println(animals.element());
        
    // empty queue
        // System.out.println(animals);
        // System.out.println(animals.peek());
        // System.out.println(animals.element());
        // System.out.println(animals.poll());
        // System.out.println(animals.remove());






            
      
    }
}

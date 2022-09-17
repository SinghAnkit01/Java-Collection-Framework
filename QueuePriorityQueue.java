import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePriorityQueue {
 public static void main(String[] args) {
    Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
    // priorityqueue cant implement using String it can implement using integer 
    // bydefault minheap data structure used for placing elements in PriorityQueue
    queue.offer(23);
    queue.offer(100);
    queue.offer(76);
    queue.offer(34);
    System.out.println(queue);
    
    // minheap datastructure implementation
    // System.out.println(queue.peek());
    // queue.poll();
    // System.out.println(queue);
    // System.out.println(queue.peek());
    // queue.poll();
    // System.out.println(queue);

    // maxheap datastructure implementation
        // System.out.println(queue.peek());
        // queue.poll();
        // System.out.println(queue);
        // System.out.println(queue.peek());
        // queue.poll();
        // System.out.println(queue);
   

    
 }   
}

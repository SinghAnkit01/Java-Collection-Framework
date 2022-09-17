import java.util.ArrayDeque;

public class QueueArrayDeque {
  public static void main(String[] args) {
    System.out.println("Double ended queue....");
    ArrayDeque<Integer> ad = new ArrayDeque<>();
    ad.offer(10);
    ad.offer(20);
    ad.offer(30);
    ad.offer(40);
    ad.offer(50);
    System.out.println(ad);
    // adding element from starting using method called ad.offerFirst() because this is double-ended-queue.
    ad.offerFirst(1000);
    System.out.println(ad);
     // adding element from ending using method called ad.offerLast() because this is double-ended-queue.
     ad.offerLast(2000);
     System.out.println(ad);
    //  removing elements from starting using pollFirst() method but before that find which element is going to delete from starting using peekFirst() method.
    System.out.println(ad.peekFirst());
    ad.pollFirst();
    System.out.println("after deleting element from starting"+" "+ad);
     //  removing elements from ending using pollLast() method but before that find which element is going to delete from starting using peekLast() method.
     System.out.println(ad.peekLast());
     ad.pollLast();
     System.out.println("after deleting element from ending"+" "+ad);
     

  }
}

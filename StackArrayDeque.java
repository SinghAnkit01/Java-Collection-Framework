import java.util.ArrayDeque;
// import java.util.Stack;

public class StackArrayDeque {
  public static void main(String[] args) {
    System.out.println("Double ended queue....");
    ArrayDeque<Integer> ad = new ArrayDeque<>();
    ad.offer(10);
    ad.offer(20);
    ad.offer(30);
    ad.offer(40);
    ad.offer(50);
    System.out.println(ad);
    // implementing stack using ArrayDeque stack is datastructure like LIFO(last in first out type) which means ..
    // elements can be added one after another stack can delete element from last means whatever element is entered laterly taht will going to be delete.    
    //  removing elements from ending using pollLast() method but before that find which element is going to delete from starting using peekLast() method.
     System.out.println(ad.peekLast());
     ad.pollLast();
     System.out.println("after deleting element from ending"+" "+ad);
     
     

  }
}


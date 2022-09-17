
import java.util.Stack;
// import java.util.List;

public class StackDS {
    public static void main(String[] args) {
        // Stack is present in List interface so we can implement list interface here using
        // List<String> list = new Stack<>();
        // for this instead of using stack.push() we have to use all list method like list.add(),list.remove(),list.get(index:indexno);

        Stack<String> stack = new Stack<>();
        stack.push("lion");
        stack.push("tiger");
        stack.push("cat");
        stack.push("elephant");

        // System.out.println(stack);
        // String a = stack.peek();
        // System.out.println(a);
        // String b = stack.pop();
        

        // System.out.println(stack);
        // String a1 = stack.peek();
        // System.out.println(a1);
        // String b1 = stack.pop();
        // System.out.println(stack);

        // work as same as push() but if element are unable to add it returns exception it may lead to app crashed 
        stack.add("snake");
        System.out.println(stack);
        
        // use to print a stack
        stack.elements();
        System.out.println(stack);

        // use to remove element fro stack work as same as pop()
        stack.remove(4);
        System.out.println(stack);



    }
}

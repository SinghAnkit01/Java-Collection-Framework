import java.util.Set;
import java.util.HashSet;

   
public class StudentHashSet{
    public static void main(String[] args) {
        // hashset is a class of Set interface which means we can use all the methods of set interface in this class.
        Set<Student> studentset  = new HashSet<>();
        studentset.add(new Student("ankit", 1));
        studentset.add(new Student("ankit ", 2));
        studentset.add(new Student("ankit", 1));
        studentset.add(new Student("ankit", 1));
        // whether the values are same but object are different that is the reason HashSet cant differentiate.
        // we know that if we are using HashSet value should be unique for every input bu in this case we are creating..
        // new object for every input that is the reason we are not getting an error.
        // if we want to push unique elements into class for that we need to create hashcode() and equals.

        Student s1= new Student("ankit singh", 2);
        Student s2= new Student("ankit singh", 3);
        System.out.println(s1.equals(s2));
        // when two peoples are equal when there rollno are same if different returns false otherwise true. 
        // System.out.println(s1.hashCode());
        // System.out.println(s2.hashCode());
        // now object may be different but rollno is same and we have generated hashcode() according to rollno.
        // if rollno what we are passing is same it will return true otherwise false. 

        System.out.println(studentset);
       
    }
}



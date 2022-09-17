import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class studentsort {
    public static void main(String[] args) {
        List<Student> studentset  = new ArrayList<>();
        studentset.add(new Student("ankit", 1));
        studentset.add(new Student("sahil ", 2));
        studentset.add(new Student("yuvraj", 4));
        studentset.add(new Student("zain", 3));

        // Student s1= new Student("ankit singh", 2);
        // Student s2= new Student("ankit singh", 3);
        // System.out.println(s1.compareTo(s2));
        // this=2
        // that=3
        // output:-1
        Collections.sort(studentset,new Comparator<Student>(){
            // creating object of comparator class or anonymous class
            // new Comparator of type student.
            @Override
            public int compare(Student o1, Student o2) {
                // compare method to implement Comparator class.
                // if it returns positive value o1 will considered big and if it is returns negative value o2 will considered big.
                // and if it is returns zero both will be considered equal
                return o1.name.compareTo(o2.name);
                // sorting on the basis of name attribute
            }
           
            
        }); 

        // Collections.sort(studentset,(o1, o2) -> o1.name.compareTo(o2.name));
        // System.out.println(studentset);
        // lambda expression 
        // same as above sorting is done on the basis of name attribute.

        System.out.println(studentset);
        
        
    }
}


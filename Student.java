

public class Student  implements Comparable<Student>{
    String name;
    private int rollno;
    // normal pojo class of java
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + rollno;
        return result;
        // hashcode is returning an integer value
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (rollno != other.rollno)
            return false;
        return true;

    }
   
    public Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
       
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + "]";
    }
    @Override
    public int compareTo(Student that) {
        // it compare currrent student with different student
        // if positive means current integer is big
        // if negative means that variable in argument student will be considered big
        return this.rollno-that.rollno;
        // sorting o the basis of rollno
    }


    
    
    
    

}

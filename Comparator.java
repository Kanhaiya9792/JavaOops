

import java.util.*;
class Student implements Comparable<Student>{
    String name;
    int rollno;
    int marks;
    Student(String n,int r,int m){
        name=n;
        rollno = r;
        marks=m;
    }

@Override
public int compareTo(Student o){
    return this.rollno - o.rollno; // todo auto-generated method stub
}
@Override
public String toString(){
    return rollno +" "+marks+" " +name;
}
}
class Comparator{
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        i.add(23);
        i.add(12);
        i.add(43);
        i.add(18);
        i.add(45);
        i.sort(null);
        
        System.out.println(i);
        i.sort(Collections.reverseOrder());//comparator for descending order
        System.out.println(i);
        ArrayList<Student> st = new ArrayList<>();
         st.add(new Student("John", 1, 90));
        st.add(new Student("Virat", 2, 100));
        st.add(new Student("Rohit", 3, 95));

        st.sort(null);
        System.out.println(st);
        




        
    }
}
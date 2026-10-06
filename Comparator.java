

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
class CustomComparator implements java.util.Comparator<Student>{
    public int compare(Student ob1,Student ob2){
        if(ob1.marks != ob2.marks){
            return ob2.marks - ob1.rollno;
        }
        return ob1.rollno - ob2.rollno;
    }
}
class NameComparator implements java.util.Comparator<Student>{
    @Override
    public int compare(Student ob1,Student ob2){
        return ob1.name.compareTo(ob2.name);
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
        st.sort(new CustomComparator());
        System.out.println(st);
        st.sort(new NameComparator());
        System.out.println(st);

        




        
    }
}

import java.util.ArrayList;

class Book{
    int id;
    String title;
    int page;
    Book(int id,String title,int page){
        this.id = id;
        this.title = title;
        this.page = page;
    }
    public String toString(){
        return id+" "+title+" "+page;
    }
}
    class BookComparator implements java.util.Comparator<Book>{
        public int compare(Book ob1,Book ob2){
            if(ob1.page != ob2.page){
                return ob1.page - ob2.page;
            }
            return ob2.page - ob1.page;
        }
    }
    public class Sorting3{
        public static void main(String[] args) {
            ArrayList<Book> list = new ArrayList<>();
            list.add(new Book(101, "Java Basics", 150));
            list.add(new Book(102,"Data Structur",200));
            list.add(new Book(103,"Computer Networks",50));
            list.add(new Book(104,"Operating System",400));
            list.sort( new BookComparator());

        for (Book b : list) {
            System.out.println(b);
        }
        }
    }

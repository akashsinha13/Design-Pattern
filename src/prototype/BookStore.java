package prototype;

import java.util.ArrayList;
import java.util.List;

public class BookStore implements Cloneable{
    private static List<Book> books;

    public static List<Book> getBooks(){
        return books;
    }

    public void load(){
        List<Book> list = new ArrayList<>();
        Book b1 = new Book(1, "Java");
        Book b2 = new Book(2, "C");
        Book b3 = new Book(3, "C++");
        list.add(b1);
        list.add(b2);
        list.add(b3);
        books = list;
    }

    public void display(){
        books.stream().forEach(i-> System.out.println(i.getId() +"  "+ i.getName()));
    }

    @Override
    public String toString() {
        return super.toString();
    }

    protected BookStore clone() throws CloneNotSupportedException{
        //deep copy is required because if we change book list of existing object,
        // it will affect new object also.
        BookStore bs = new BookStore();
        bs.books = books;
        return bs;
    }
}

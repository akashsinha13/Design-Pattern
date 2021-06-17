package prototype;

/*
It comes to play when performance matters
This pattern is used when creating a new object is costly
*/
public class Test {

    /*
     The best use-case for this pattern if an object is created after a costly database operation:
     you get all the data with the query (or queries) and you can use this information later to have new objects populated.
     With this approach you can reduce the number of database operations and save some I/O time for your application.
    */
    public static void main(String[] args) throws CloneNotSupportedException{
        BookStore bs = new BookStore();
        bs.load();
        bs.display();

        BookStore bs1 = bs.clone();
        bs1.load();
        bs1.display();
    }
}
package observer;

public class Test {
    public static void main(String[] args) {
        Subject sub = new SubjectImpl();
        Observer ob1 = new Observer1();
        Observer ob2 = new Observer2();

        // Add observers
        sub.attach(ob1);
        sub.attach(ob2);

        // Update subject and notify observer
        sub.notifyObserver();

        // Detach observer
        sub.detach(ob1);

        // Update subject and notify observer
        sub.notifyObserver();
    }

}

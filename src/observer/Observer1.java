package observer;

public class Observer1 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("From Observer1 " + msg);
    }
}

package observer;

public class Observer2 implements Observer {
    @Override
    public void update(String msg) {
        System.out.println("From Observer2 " + msg);
    }
}

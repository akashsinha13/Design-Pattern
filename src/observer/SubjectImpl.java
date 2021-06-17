package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {
    List<Observer> observer = new ArrayList<>();
    Message msg = new Message();

    @Override
    public void attach(Observer o) {
        observer.add(o);
    }

    @Override
    public void detach(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObserver() {
        for(Observer ob : observer) {
            ob.update(msg.getMsg());
        }
    }
}

package singleton;
// Sol 2
/*
Same as eager initialization except, here object is created when getInstance is being called

Drawback: not thread safe
 */
public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {

    }

    public static LazyInitialization getInstance() {
        if(instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}

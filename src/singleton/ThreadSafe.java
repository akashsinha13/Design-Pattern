package singleton;
// Sol 3
/*
Thread safe but has performance drawback.
It reduces the performance if application uses thread havingly
 */
public class ThreadSafe {
    private static ThreadSafe instance;

    private ThreadSafe() {

    }

    public static synchronized ThreadSafe getInstance() {
        if(instance == null) {
            instance = new ThreadSafe();
        }
        return instance;
    }
}

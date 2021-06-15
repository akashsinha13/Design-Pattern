package singleton;
// Sol 4
/*
Instead of creating method synchronized we synchronize object creation as
if instance is created synchronization is not required
 */
public class DoubleCheckedLocking {
    private static DoubleCheckedLocking instance;

    private DoubleCheckedLocking() {

    }

    public static DoubleCheckedLocking getInstance() {
        if(instance == null) {
            synchronized (DoubleCheckedLocking.class) {
                if(instance == null) {
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}

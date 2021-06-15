package singleton;
// Sol 5
/*
Soln given by BillPugh
Idea: Use inner static helper class

Explanation : When the singleton class is loaded,
Helper class is not loaded into memory and only when someone calls the getInstance method,
this class gets loaded and creates the Singleton class instance.
 */
public class BillPugh {

    private BillPugh() {

    }

    private static class Helper {
        private static final BillPugh instance = new BillPugh();
    }

    public static BillPugh getInstance() {
        return Helper.instance;
    }

}

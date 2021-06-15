package singleton;

import java.io.Serializable;

// Sol 7
/*
Below implementation avoid creation of new instance on cloning and deserialization

 */
public class Final implements Cloneable, Serializable {

    private static final long serialVersionUID = -756476693017737115L;

    private Final() {

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new CloneNotSupportedException();
    }

    // to return one object all the time during deserialization
    protected Object readResolve() {
        return getInstance();
    }

    private static class Helper {
        private static final Final instance = new Final();
    }

    public static Final getInstance() {
        return Helper.instance;
    }
}

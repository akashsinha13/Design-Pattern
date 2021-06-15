package singleton;
// Sol 1
/*
Simple way to create Singleton class
1. private constructor
2. static method to return instance

Drawback:
1. Instance is created always even if it is not required
2. Increases the loading time of application
 */
public class EagerInitialization {
    private static final EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return instance;
    }
}

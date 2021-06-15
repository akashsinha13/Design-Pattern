package singleton;
// Sol 6
/*
With Reflection, we can break all the above solns
Java ensures that any enum value is instantiated only once in a Java program.
Since Java Enum values are globally accessible, so is the singleton.
Drawback: the enum type is somewhat inflexible;
for example, it does not allow lazy initialization.
 */
public enum EnumSingleton {
    INSTANCE;
}

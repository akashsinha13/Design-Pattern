package factory;

/*
Factory pattern is used to create instances of different classes of the same type.
 */
public class Test {
    public static void main(String[] args) {
        Car c1= CarFactory.getInstance(CarType.SMALL);
        c1.service();

        Car c2= CarFactory.getInstance(CarType.SEDAN);
        c2.service();
    }
}

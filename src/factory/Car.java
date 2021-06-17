package factory;

public abstract class Car {
    private CarType model;

    public Car(CarType carType) {
        this.model = carType;
    }

    // ask subclasses to implement these methods
    protected abstract void construct();

    protected abstract void benefits();

    protected abstract void price();

    // Something which is common across all the cars
    public void service() {
        System.out.println("We provide services in almost the cities of India for "+ model+ " car");
    }
}

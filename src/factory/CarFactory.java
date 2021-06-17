package factory;

public class CarFactory {
    public static Car getInstance(CarType type) {
        Car car;
        switch (type) {
            case SMALL: car = new Small(type);
                        break;
            case SEDAN: car = new Sedan(type);
                        break;
            case LUXURY: car = new Luxury(type);
                        break;
            default: car = null;
        }
        return car;
    }
}

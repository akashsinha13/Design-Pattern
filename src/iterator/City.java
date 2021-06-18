package iterator;

import java.util.Iterator;
import java.util.List;

public class City implements CustomIterator {

    private List<String> cities;

    public City(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public Iterator<String> iterator() {
        return cities.iterator();
    }
}

package iterator;

import java.util.Iterator;
import java.util.Map;

public class Country implements CustomIterator {
    private Map<Integer, String> countries;

    public Country(Map<Integer, String> countries) {
        this.countries = countries;
    }

    @Override
    public Iterator<String> iterator() {
        return countries.values().iterator();
    }
}

package iterator;

import java.util.Arrays;
import java.util.Iterator;

public class State implements  CustomIterator {
    private String[] states;

    public State(String[] states) {
        this.states = states;
    }


    @Override
    public Iterator<String> iterator() {
        return Arrays.asList(states).iterator();
    }
}

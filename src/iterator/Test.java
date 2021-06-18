package iterator;

import java.util.*;

/* helps to iterate over different collection without
  knowing the underlying implementation
*/
public class Test {
    public static void main(String[] args) {
        String[] s = {"Bihar", "UP", "Karnataka"};
        State state = new State(s);

        List<String> city = new ArrayList<>();
        city.add("Patna");
        city.add("Jamshedpur");
        city.add("Bangalore");
        City c = new City(city);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "India");
        map.put(2, "Nepal");
        map.put(3, "Bhutan");
        Country country = new Country(map);

        Iterator i1 = state.iterator();
        Iterator i2 = c.iterator();
        Iterator i3 = country.iterator();

        while (i1.hasNext()) {
            System.out.println(i1.next());
        }

        System.out.println("==========================");
        while (i2.hasNext()) {
            System.out.println(i2.next());
        }

        System.out.println("==========================");
        while (i3.hasNext()) {
            System.out.println(i3.next());
        }
    }
}

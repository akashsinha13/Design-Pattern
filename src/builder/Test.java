package builder;

/*We can use this pattern when we have more number of attributes in a class
or when object creation is complex

Solve below problems
1. to remember the order of params
2. to initialize all the attributes
*/

public class Test {
    public static void main(String[] args) {
        Computer cb = new ComputerBuilder().setModelName("DEll").setPrice(45000.00F).build();
        System.out.println(cb.toString());
    }
}
package strategy;

/*
 Strategy pattern involves removing an algorithm from its host class and
 putting it in separate class so that in the same programming context
 there might be different algorithms (i.e. strategies), which can be selected in runtime.
 Ex: Collections.sort()
*/
public class Test {
    public static void main(String[] args) {
        Context c1 = new Context(new OperationAdd());
        c1.operation(5, 10);

        Context c2 = new Context(new OperationMultiply());
        c2.operation(2, 4);
    }
}

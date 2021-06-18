package strategy;

public class Context {
    private Strategy st;

    Context(Strategy strategy) {
        st = strategy;
    }

    public void operation(int num1, int num2) {
        st.performOperation(num1, num2);
    }
}

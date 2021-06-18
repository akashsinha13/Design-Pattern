package strategy;

public class OperationAdd implements Strategy {
    @Override
    public void performOperation(int num1, int num2) {
        int res = num1 + num2;
        System.out.println("Operation add: "+ res);
    }
}

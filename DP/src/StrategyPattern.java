interface Strategy{
    public int doOperation(int num1,int num2);
}

class OperationAdd implements Strategy{
    public int doOperation(int num1,int num2){
        return num1+num2;
    }
}

class OperationSub implements Strategy{
    public int doOperation(int num1,int num2){
        return num1-num2;
    }
}

class OperationMul implements Strategy{
    public int doOperation(int num1,int num2){
        return num1*num2;
    }
}

class Context{
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}

public class StrategyPattern {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("The addition of two numbers is "+ context.executeStrategy(5,10));

        context = new Context(new OperationSub());
        System.out.println("The subtraction of two numbers is "+ context.executeStrategy(10,5));

        context = new Context(new OperationMul());
        System.out.println("The multiplication of two numbers is "+ context.executeStrategy(10,5));

    }

}

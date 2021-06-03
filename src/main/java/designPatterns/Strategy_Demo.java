package designPatterns;

/**
 * Created by Ramesh on 030 30.May.21.
 */

interface Strategy {
    void operation(int number1, int number2);
}

class StrategyAdd implements Strategy {
    @Override
    public void operation(int number1, int number2) {
        System.out.println("SUM--->  " + (number1+number2));
    }
}

class StrategySub implements Strategy {
    @Override
    public void operation(int number1, int number2) {
        System.out.println("SUB--->  " + (number1-number2));
    }
}

class StrategyDiv implements Strategy {
    @Override
    public void operation(int number1, int number2) {
        System.out.println("DIV--->  " + (number1/number2));
    }
}

class StrategyUse {
    Strategy strategy;
    public StrategyUse(Strategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(int number1, int number2) {
        strategy.operation(number1, number2);
    }
}

public class Strategy_Demo {
    public static void main(String[] args) {
        StrategyUse strategyUse = new StrategyUse(new StrategyAdd());
        strategyUse.executeStrategy(10,20);

        new StrategyUse(new StrategySub()).executeStrategy(20,30);
        new StrategyUse(new StrategyDiv()).executeStrategy(30,20);
    }
}

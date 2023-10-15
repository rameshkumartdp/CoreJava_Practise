package designPatterns;

interface Interface {
    String welcome();
}

class SubClass1 implements Interface {
    @Override
    public String welcome() {
        return "Welcome JAVA ";
    }
}

abstract class AbstractDecorator implements Interface {
    Interface anInterface;
    public AbstractDecorator(Interface anInterface) {
        this.anInterface = anInterface;
    }

    @Override
    public String welcome() {
        return anInterface.welcome();
    }
}

class DecoratorClass1 extends AbstractDecorator {
    DecoratorClass1(Interface interfcae) {
        super(interfcae);
    }

    @Override
    public String welcome() {
        return anInterface.welcome()+ " Once ";
    }
}

class DecoratorClass2 extends AbstractDecorator {
    DecoratorClass2(Interface interfcae) {
        super(interfcae);
    }

    @Override
    public String welcome() {
        return anInterface.welcome() + " Twice ";
    }
}

public class Decorator_Demo {
    public static void main(String[] args) {
        DecoratorClass2 dc2 = new DecoratorClass2(new DecoratorClass1(new SubClass1()));
        System.out.println(dc2.welcome());
    }
}

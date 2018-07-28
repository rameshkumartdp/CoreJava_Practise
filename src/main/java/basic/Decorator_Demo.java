package basic;

/**
 * Created by rk0000 on 01-02-2017.
 */
interface Base {
    public String welcome();
}

class Derived implements Base {
    public String welcome(){
        return "Welcome to Decorator";
    }
}

abstract class DerivedDecorator implements Base {
    Base base;
    DerivedDecorator(Base base){
        this.base=base;
    }
    public String welcome() {
        return base.welcome();
    }
}

class DerivedSub1 extends DerivedDecorator {
    DerivedSub1(Base base) {
        super(base);
    }
    public String welcome() {
        return base.welcome()+" first ";
    }
}

class DerivedSub2 extends DerivedDecorator {
    DerivedSub2(Base base) {
        super(base);
    }
    public String welcome() {
        return base.welcome()+" second ";
    }
}

public class Decorator_Demo {
    public static void main(String[] args) {
        DerivedSub2 obj = new DerivedSub2(new DerivedSub1(new Derived()));
        System.out.println(obj.welcome());
    }
}

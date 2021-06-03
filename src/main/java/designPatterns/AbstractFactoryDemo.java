package designPatterns;

/**
 * Created by rk0000 on 8/2/18.
 */
interface Flight {
    String flightName();
}

class Indigo implements Flight {
    public String flightName() {
        return "INDIGO";
    }
}

class AirIndia implements Flight {
    public String flightName() {
        return "AIRINDIA";
    }
}

abstract class AbstractFactory {
    public abstract Flight flightFactory(String flightName);
}

class FlightFactory extends AbstractFactory {

    @Override
    public Flight flightFactory(String flightName) {
        if(flightName.equals("INDIGO")) {
            return new Indigo();
        } else if(flightName.equals("AIRINDIA")) {
            return new AirIndia();
        }
        return null;
    }
}

class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equals("Flight")) {
            return new FlightFactory();
        }
        return null;
    }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory factory = FactoryProducer.getFactory("Flight");
        Flight flight = factory.flightFactory("INDIGO");
        System.out.println(flight.flightName());
    }

}

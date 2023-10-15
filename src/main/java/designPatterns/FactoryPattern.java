package designPatterns;

/**
 * Created by rk0000 on 7/18/18.
 */
public class FactoryPattern {
    public static void main(String[] args) {
        Currency currency = CurrencyFactory.createCurrency("USD");
        System.out.println(currency.currencyName());
    }

}

interface Currency {
    String currencyName();
}

class USCurrency implements Currency {
    public String currencyName() {
        return "USD";
    }
}

class INDCurrency implements Currency {
    public String currencyName() {
        return "INR";
    }
}

class UKCurrency implements Currency {
    public String currencyName() {
        return "GBP";
    }
}

class CurrencyFactory {
    public static Currency createCurrency(String currency) {
        if(currency.equals("USD")) {
            return new USCurrency();
        }
        if(currency.equals("INR")) {
            return new INDCurrency();
        }
        if(currency.equals("GBP")) {
            return new UKCurrency();
        }
        throw new IllegalArgumentException("No currency");
    }
}



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
        return "US Dollar";
    }
}

class INDCurrency implements Currency {
    public String currencyName() {
        return "Indian Rupee";
    }
}

class UKCurrency implements Currency {
    public String currencyName() {
        return "Britain Pound";
    }
}

class CurrencyFactory {
    public static Currency createCurrency(String currency) {
        switch (currency) {
            case "USD": return new USCurrency();
            case "INR": return new INDCurrency();
            case "GBP": return new UKCurrency();
            default: throw new IllegalArgumentException("No currency");
        }
    }
}



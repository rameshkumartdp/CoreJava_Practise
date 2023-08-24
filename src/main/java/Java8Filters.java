import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Filters {

    static List<Trade> tradeList = new ArrayList<>();

    public static void init() {
        tradeList = Arrays.asList(new Trade("1", "Citi", 100.0, true),
                    new Trade("2", "Visa", 200.0, false),
                    new Trade("3", "DBS", 300.0, false),
                    new Trade("4", "fourth", 40.0, false),
                    new Trade("5", "Citi", 500.0, true));
    }

    public static void main(String[] args) {
        init();
        List<String> resultTrades = new ArrayList<>();
        tradeList.stream().filter(trade -> {
            if(trade.isValidTrade) {
                resultTrades.add(trade.tradeDescription);
                return true;
            }
            if(trade.tradeDescription.contains("Citi")) {
                resultTrades.add(trade.tradeDescription);
                return true;
            }
            if(trade.tradeAmount >= 100) {
                resultTrades.add(trade.tradeDescription);
                return true;
            } else {
                return false;
            }
        }).map(trade -> trade.tradeDescription)
                .collect(Collectors.toList());

        System.out.println(resultTrades);
    }
}

class Trade {
    String tradeId;
    String tradeDescription;
    double tradeAmount;
    boolean isValidTrade;

    public Trade(String tradeId, String tradeDescription, double tradeAmount, boolean isValidTrade) {
        this.tradeId = tradeId;
        this.tradeDescription = tradeDescription;
        this.tradeAmount = tradeAmount;
        this.isValidTrade = isValidTrade;
    }

    public String getTradeId() {
        return tradeId;
    }

    public String getTradeDescription() {
        return tradeDescription;
    }

    public double getTradeAmount() {
        return tradeAmount;
    }

    public boolean isValidTrade() {
        return isValidTrade;
    }
}
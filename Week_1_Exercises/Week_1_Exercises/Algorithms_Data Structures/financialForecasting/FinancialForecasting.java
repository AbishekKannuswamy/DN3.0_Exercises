package financialForecasting;

import java.util.HashMap;
import java.util.Map;

public class FinancialForecasting {

    private static Map<Integer, Double> memo = new HashMap<>();

    public static double computeFutureValue(double presentValue, double growthRate, int periods) {
        if (periods == 0) {
            return presentValue;
        }

        if (memo.containsKey(periods)) {
            return memo.get(periods);
        }

        double futureValue = computeFutureValue(presentValue * (1 + growthRate), growthRate, periods - 1);

        memo.put(periods, futureValue);

        return futureValue;
    }

    public static void main(String[] args) {
        double initialValue = 1000.0;
        double rateOfGrowth = 0.05;
        int numberOfPeriods = 10;

        double finalValue = computeFutureValue(initialValue, rateOfGrowth, numberOfPeriods);
        System.out.printf("The future value after %d periods is: %.2f%n", numberOfPeriods, finalValue);
    }
}

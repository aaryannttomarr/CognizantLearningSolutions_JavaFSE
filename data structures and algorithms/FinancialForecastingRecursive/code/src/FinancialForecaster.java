public class FinancialForecaster {

    public static double predictValue(int years, double initialValue, double growthRate) {
        if (years == 0) {
            return initialValue;
        }
        return predictValue(years - 1, initialValue, growthRate) * (1 + growthRate);
    }

    public static double predictValueIterative(int years, double initialValue, double growthRate) {
        double result = initialValue;
        for (int i = 0; i < years; i++) {
            result *= (1 + growthRate);
        }
        return result;
    }
}

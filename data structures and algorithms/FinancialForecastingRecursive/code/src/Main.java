public class Main {
    public static void main(String[] args) {
        double initial = 10000;
        double rate = 0.08;
        int years = 5;

        double futureValue = FinancialForecaster.predictValue(years, initial, rate);
        System.out.println("Recursive Future Value: ₹" + futureValue);

        double futureValueIter = FinancialForecaster.predictValueIterative(years, initial, rate);
        System.out.println("Iterative Future Value: ₹" + futureValueIter);
    }
}

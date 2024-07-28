public class Test{
    public static void main(String[] args) {
        FinancialForecast forecast = new FinancialForecast(0.1); // 10% growth rate

        double initialValue = 1000;
        int periods = 5;

        double recursiveResult = forecast.predictValue(initialValue, periods);

        System.out.println("Recursive result: " + recursiveResult);
    }
}
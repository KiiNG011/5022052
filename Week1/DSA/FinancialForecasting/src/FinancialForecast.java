public class FinancialForecast {
    private double growthRate;

    public FinancialForecast(double growthRate) {
        this.growthRate = growthRate;
    }

    public double predictValue(double initialValue, int periods) {
        // Recursive implementation here
        if (periods == 0) {
            return initialValue;
        } else {
            return predictValue(initialValue * (1 + growthRate), periods - 1);
        }
    }
}
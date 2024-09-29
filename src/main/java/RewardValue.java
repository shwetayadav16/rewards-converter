public class RewardValue {
    private double cashValue;
    private static final double MILES_CONVERSION_RATE = 0.0035;  // Example conversion rate: 1 mile for every $0.0035

    // Constructor to initialize the cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    // Method to convert the cash value to miles
    public double getMilesValue() {
        return cashValue / MILES_CONVERSION_RATE;  // Convert cash value to miles
    }

    // Getter for cash value (if needed in future)
    public double getCashValue() {
        return cashValue;
    }
}

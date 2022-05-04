public class CreditPaymentService {
    public double calculate(int month, int loan, double percent) {
        double monthlyInterestRate = percent / (100 * 12);
        double denominator = 1 - Math.pow((1 + monthlyInterestRate), -month);
        double monthlyPaymentAmounty = loan * (monthlyInterestRate / denominator);
        return monthlyPaymentAmounty;

    }
}

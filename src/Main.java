public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int month = 12;
        int month2 = 24;
        int month3 = 36;
        int loan = 1_000_000;
        double percent = 9.99;
        double paymеnt = service.calculate(month, loan, percent);
        double paymеnt2 = service.calculate(month2, loan, percent);
        double paymеnt3 = service.calculate(month3, loan, percent);
        String result = String.format("%.0f",paymеnt);
        String result2 = String.format("%.0f",paymеnt2);
        String result3 = String.format("%.0f",paymеnt3);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}
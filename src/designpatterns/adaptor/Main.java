package designpatterns.adaptor;

public class Main {
    public static void main(String[] args) {
        BankAPI api = SimpleBankApiAdaptorFactory.getBankApi("ICICI");
        PhonePe phonePe = new PhonePe(api);
        boolean eligibility = phonePe.checkLoanEligibility();
        System.out.println("Eligible for the loan " + eligibility);
    }
}

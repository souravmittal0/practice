package designpatterns.adaptor;

public class PhonePe {

    PhonePeLoan loan = new PhonePeLoan();
    FastTagRecharge fasttagRecharge = new FastTagRecharge();
    private final BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public boolean checkLoanEligibility() {
        return loan.checkLoanEligibility(bankAPI);
    }
}

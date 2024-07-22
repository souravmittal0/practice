package designpatterns.adaptor;

public class PhonePeLoan {

    public boolean checkLoanEligibility(BankAPI api) {
        if (api.checkBalance() > 100) {
            return true;
        }
        return false;
    }
}

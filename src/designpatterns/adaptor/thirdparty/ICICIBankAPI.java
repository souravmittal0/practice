package designpatterns.adaptor.thirdparty;

public class ICICIBankAPI {
    public int availableAmount() {
        return 200;
    }

    public boolean sendMoney() {
        System.out.println("Sent 100");
        return true;
    }
}

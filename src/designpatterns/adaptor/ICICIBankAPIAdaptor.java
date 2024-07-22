package designpatterns.adaptor;

import designpatterns.adaptor.thirdparty.ICICIBankAPI;

public class ICICIBankAPIAdaptor implements BankAPI {

    private ICICIBankAPI api;
    public ICICIBankAPIAdaptor (ICICIBankAPI api) {
        System.out.println("ICICI Bank is linked");
        this.api = api;
    }

    @Override
    public int checkBalance() {
        return api.availableAmount();
    }

    @Override
    public void transferAmount(int money) {
        api.sendMoney();
    }
}

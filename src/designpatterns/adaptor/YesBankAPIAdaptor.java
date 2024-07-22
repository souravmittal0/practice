package designpatterns.adaptor;

import designpatterns.adaptor.thirdparty.YesBankAPI;

public class YesBankAPIAdaptor implements BankAPI {

    YesBankAPI api = new YesBankAPI();

    public YesBankAPIAdaptor() {
        System.out.println("YesBank is linked");
    }
    @Override
    public int checkBalance() {
        return api.availableAmount();
    }

    @Override
    public void transferAmount(int money) {
        api.setTransferAmount(money);
        api.sendMoney();
    }
}

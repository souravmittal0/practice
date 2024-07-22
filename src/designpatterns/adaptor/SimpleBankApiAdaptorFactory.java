package designpatterns.adaptor;

import designpatterns.adaptor.thirdparty.ICICIBankAPI;

public class SimpleBankApiAdaptorFactory {
    public static BankAPI getBankApi(String bankName) {
        if (bankName.equalsIgnoreCase("ICICI")) {
            return new ICICIBankAPIAdaptor(new ICICIBankAPI());
        }
        return new YesBankAPIAdaptor();
    }
}

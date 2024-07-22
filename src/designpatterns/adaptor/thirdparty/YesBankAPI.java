package designpatterns.adaptor.thirdparty;

public class YesBankAPI {

    int transferAmount;
    public int availableAmount() {
        return 100;
    }

    public boolean sendMoney() {
        System.out.println("Sent " + transferAmount);
        return true;
    }

    public void setTransferAmount(int transferAmount) {
        this.transferAmount = transferAmount;
    }
}

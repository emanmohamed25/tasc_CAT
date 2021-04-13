
package taskcat;


public class BalanceInquiry extends Transaction {
    String currencyType;
    public BalanceInquiry(String _currencyType)
    {
        currencyType=_currencyType;
    }
    double execute(Account account)
    {
        return account.balance;
    }
}

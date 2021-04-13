
package taskcat;


public class Deposit  extends Transaction implements Rollback{

    double amount ;
     public Deposit(double _amount)
    {
        amount=_amount;
    }
    double execute(Account account)
    {
        return account.balance+amount;
    }
    @Override
    public double cancelTransaction(Account account) {
        return account.balance-amount;
    }
    
}

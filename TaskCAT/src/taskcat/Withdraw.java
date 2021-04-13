
package taskcat;


public class Withdraw  extends Transaction implements Rollback{
    
    double amount ;
    public Withdraw(double _amount)
    {
        amount=_amount;
    }
    double execute(Account account)
    {
        return account.balance-amount;
    }
    @Override
    public double cancelTransaction(Account account) {
        return account.balance+amount;
    }
}

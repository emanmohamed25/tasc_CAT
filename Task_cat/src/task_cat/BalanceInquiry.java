
package task_cat;

public class BalanceInquiry extends Transaction {
      
    String currencyType;
   
    @Override
    double execute(Account account )
    {
        return account.find_account(account.GET_Name());
    }

}

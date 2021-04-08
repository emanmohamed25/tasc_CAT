
package task_cat;

import java.util.Scanner;

//class لسحب رصيد
public class Withdraw  extends Transaction implements Rollback  {
   double  amount;
   double NewBalance;
   Scanner s=new Scanner(System.in);
   
   @Override
   double  execute(Account account)
    {
       amount =s.nextDouble();
       NewBalance=  account.find_account(account.GET_Name())-amount;
       return NewBalance;
    }

    /**
     *
     * @param account
     * @return
     */
    @Override
    public double cancelTransaction(Account account) {
          NewBalance=  amount+account.find_account(account.GET_Name());
       return NewBalance;
    }

    
}


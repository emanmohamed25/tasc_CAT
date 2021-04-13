
package taskcat;

import java.util.Scanner;

public class TaskCAT {
Deposit deposit =new Deposit(GetAmount());
Withdraw withdraw=new Withdraw(GetAmount());
BalanceInquiry balanceInquiry =new BalanceInquiry  ( GetCurrencyType());

Scanner s=new Scanner(System.in );
Account account = new Account();

    TaskCAT obj=new TaskCAT();
     public  static void main(String[] args) 
     {
      obj.Prosses();
     }
    public void Prosses() {
        System.out.println("please,enter your accounyt");
       obj.CreatAccount();
       System.out.println("Press 2 to deposit\n" +
                          "- Press 3 to withdraw\n" +
                          "- Press 4 to show current balance\n" +
                          "- Press 5 to cancel last transaction\n" +
                          "- Press 6 to exit");
       int test=s.nextInt();
        switch (test)
        {
            case 2:
            {
                obj.GetAmount();
                deposit.excute(account);
                 System.out.println("now..! Your Balance is : "+deposit.excute(account));
                 break;
            }
            case 3:
            {
                obj.GetAmount();
                withdraw.execute(account);
                System.out.println("now..! Your Balance is : "+withdraw.execute(account));
                break;
            }
            case 4:
            {
               System.out.println("now..! Your Balance is : "+
                       balanceInquiry.execute(account));
               break;
            
            }
                
            case 5:
            {
                System.out.println("Please enter(1) to cancel the last withdrawal or"
                        + " (2) to cancel the last deposit)");
               int NumberTest=s.nextInt();
               if(NumberTest==1)
               {
                   withdraw.cancelTransaction(account);
                   System.out.println("now..! Your Balance is : "
                   +withdraw.cancelTransaction(account));
               }
               else
               {
                   deposit.cancelTransaction(account);
                   System.out.println("now..! Your Balance is : "
                                      +deposit.cancelTransaction(account));
               }
               break;
            }
            case 6:
                   System.out.println("The processing process was successful .. Thank you..!");
        }
    }

   

   
    public void CreatAccount()
    {

        System.out.println("Please,Enter your AccountNumber : ");
        account.accountNumber=s.nextInt();
        System.out.println("Please,Enter your ownerName :  ");
        account.ownerName=s.next();
        System.out.println("Please,Enter your Balance : ");
       account.balance=s.nextDouble();
    
    }
    
    
    public double GetAmount()
    {
        System.out.println("Please,Enter the Amount :  ");
        double amount =s.nextDouble();
        return amount;
    }
   public String GetCurrencyType()
   {
        System.out.println("Please,Enter currencyType : ");
        String type=s.next();
        return type;

   
   }
    
}


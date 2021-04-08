
package task_cat;

import java.util.Scanner;


public class Task_cat {

   
    public static void main(String[] args) {
       Test();
    }
    
    public static void Test()
    {
        Account account=new Account();
        Scanner s = new Scanner (System.in);
        Deposit deposit=new Deposit();
        Withdraw withdraw=new Withdraw();
        int count=0;
        System.out.println("- Press 1 to enter account details\n" +
                           "- Press 2 to deposit\n" +
                           "- Press 3 to withdraw\n" +
                           "- Press 4 to show current balance\n" +
                           "- Press 5 to cancel last transaction\n" +
                           "- Press 6 to exit");
        int test =s.nextInt();
        
        switch (test) {
            case 1:
                Account.DataOfUser[count].creat_account();
                count++;
                Test();
                break;
            case 2:
                System.out.println("Please ,enter the required amount : ");
                System.out.println(" Your process success..\n Now..your Balance is : "+deposit.execute(account));
                Test();
                break;
            case 3:
                System.out.println("Please ,enter the required amount : ");
                System.out.println(" Your process success..\n Now..your Balance is : "+ withdraw.execute(account));
                 Test();
                break;
            case 4:
                {
                    System.out.println("Please ,enter the required currency type " +
                            "'U for USD, E for euro': ");
                    String type =s.next();
                    BalanceInquiry balanceInquiry = new BalanceInquiry();
                    if(type.equalsIgnoreCase("U"))
                    {
                        
                        System.out.println("Your balane is :"+balanceInquiry.execute(account)+'U');
                    }
                    else
                    {
                        
                        System.out.println("Your balane is :"+balanceInquiry.execute(account)+'E');
                    } 
                    Test();
                    break;
                }
            case 5:
                {
                    System.out.println(" Enter (1) to cancel the last Withdrawal and "
                            + " (2) to cancel the last Deposit");
                    int type =s.nextInt();
                    if(type==1)
                    {
                        withdraw.cancelTransaction(account);
                    }
                    else
                        deposit.cancelTransaction(account);
                    Test();
                    break;
                }
            default:
                System.out.println ("The process completed successfully ..!");
                Test();
                break;
        }
            
        
        }
    
        
       
        
    }


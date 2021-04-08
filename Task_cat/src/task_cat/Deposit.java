/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_cat;

import java.util.Scanner;

//class لايداع رصيد
public class Deposit extends Transaction implements Rollback  {
    double  amount;
    double NewBalance;
   Scanner s=new Scanner(System.in);
    @Override
    double execute(Account account)
    {
       amount =s.nextDouble();
       NewBalance=  account.find_account(account.GET_Name())+amount;
       return NewBalance;
    }
//الكومنت دا مش عارفه هو ليه عمله
    /**
     *
     * @param account
     * @return
     */
    @Override
    public double cancelTransaction(Account account) {
          NewBalance=  amount-account.find_account(account.GET_Name());
       return NewBalance;
    }
}

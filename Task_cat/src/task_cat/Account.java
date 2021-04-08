/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task_cat;

import java.util.Scanner;

/**
 *
 * @author Eman
 */
public class Account {
    public int  accountNumber;
    public String ownerName;
    public double balance;
   // public static int count=0;
    public static Account []DataOfUser;
    Scanner s= new Scanner (System.in);
//    public Account()
//    {
//        count++;
//    }
            
            

    
    public void creat_account()
    {
        System.out.println("Please,Enter your Account_Number : ");
       accountNumber =s.nextInt();
       System.out.println("Please,Enter ownerName : ");
       ownerName=s.nextLine();
       System.out.println("Please,Enter your balance : ");
       balance=s.nextDouble();
    }
    public String GET_Name()
    {
        System.out.println("Please,Enter ownerName : ");
        return s.nextLine();
        
    }
    
    public double find_account(String name)
    {
        
       for(int i =0;i<DataOfUser.length;i++)
       {
           if(DataOfUser[i].ownerName.equalsIgnoreCase(name))
           return DataOfUser[i].balance;
       }
       return -1;
    }
    
}

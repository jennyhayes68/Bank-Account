/**********************************************************************************
Author's Name: Jenny Hayes
Date: 3/5/21
Program: HW7
Description: Creating a bank account and processing transactions.
***********************************************************************************/
import java.util.*;

public class BankAccount
{                                        //instance variables
   private double balance;
  // private double deposit;
  // private double withdrawal;

public BankAccount()
{
	balance=0.00;
	//deposit=0.00;
	//withdrawal=0.00;
}

public BankAccount(double b)              //constructor with parameters
{
	balance=b;
}

public double getBalance()
{
	return balance;
}

public void bankTransaction(double amount)                //processing bank transaction

    {
		if(amount>=0){
		balance= balance + amount;
	    System.out.println("The deposit amount is: " +amount);
        }

          if(amount<0){
	       balance= balance + amount;
	       System.out.println("The withdrawal amount is: " +amount);
		              }
            if(withdrawal<balance){
			   balance=balance + withdrawal;
		   }
		     else
		     {
	   	         System.out.println("No Funds are available");
			 }
   }


public String toString()                                            //printing the statement
 {
   return ("The current balance is $  "  +balance);
 }

}


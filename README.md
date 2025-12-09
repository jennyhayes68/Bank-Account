# Bank-Account
/******************************************************************
Author's Name: Jenny Hayes
Date: 3/5/21
Program: HW7
Description: Creating a bank account and processing transactions.
******************************************************************/
import java.util.*;

public class RunAccount
{
	static Scanner console=new Scanner(System.in);

	public static void main(String[] args)
	  {

		BankAccount ba=new BankAccount();                 //class object

          double balance=0.00;
		  double amount;

		do
		{

	     System.out.print("Please enter an amount, enter a negative amount for withdrawal: ");

         balance = console.nextDouble();                           //entering the balance to process the transaction
         ba.bankTransaction(balance);
         System.out.println(ba.toString());             //calling the toString method to print

         System.out.println();
	}
	while(balance != 0);

}
}

Created a bank account to deposit and withdraw money(use the (-) sign to withdraw)
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

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
		  double firstAmount=0.00;
          double deposit;
          double withdrawal;
        do
         {

	     System.out.print("Please enter an amount: ");

         balance=console.nextDouble();                           //entering the balance to process the transaction
         ba.bankTransaction(balance);
         System.out.println(ba.toString());             //calling the toString method to print

         System.out.println();
    	 }
        while (balance != 0);

}
}

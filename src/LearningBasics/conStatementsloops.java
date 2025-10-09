package LearningBasics;

import java.util.ArrayList;
import java.util.List;

public class conStatementsloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List <Integer> trans =new ArrayList<Integer>();
trans.add(50000);
trans.add(-2000);
trans.add(3000);
trans.add(-15000);
trans.add(-200);
trans.add(-300);
trans.add(4000);
trans.add(-3000);
int cC = 0;
int dC = 0;
int tCredit = 0;
int tDebit = 0;
int sCount = 0;

for (int amount : trans) {
    if (amount > 0) {
        cC++;
        tCredit += amount;

        if (amount > 10000) {
            System.out.println("Suspicious credit transaction with Amount " + amount);
            sCount++;
        }
    }

    else {
        dC++;
        tDebit += Math.abs(amount);

        if (amount < -10000) {
            System.out.println("Suspicious debit transaction with Amount " + amount);
            sCount++;
        }
    }
}


int finalBalance = tCredit - tDebit;

// Step 5: Print the summary
System.out.println("\n----- Transaction Summary -----");
System.out.println("Total Credit Transactions: " + cC);
System.out.println("Total Debit Transactions: " + dC);
System.out.println("Total Amount Credited: " + tCredit);
System.out.println("Total Amount Debited: " + tDebit);
System.out.println("Final Balance: " + finalBalance);
System.out.println("Total Suspicious Transactions: " + sCount);
	}

}

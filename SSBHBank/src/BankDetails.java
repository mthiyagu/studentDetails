import java.util.Scanner;

public class BankDetails {

	Scanner Acnum = new Scanner(System.in);
	int accountNumber;
	Scanner Acname = new Scanner(System.in);
	String name;
	Scanner AcCredit = new Scanner(System.in);
	int credit;
	Scanner Acdebit = new Scanner(System.in);
	int debit;
	Scanner AcBal = new Scanner(System.in);
	int balance;

	void add() {
		System.out.println("Please enter bank account number:");
		accountNumber = Acnum.nextInt();
		System.out.println("Please enter the A/c Holder name: ");
		name = Acname.nextLine();
		System.out.println("Please mention the deposit amount:");
		credit = AcCredit.nextInt();
		balance += credit;

	}

	void credit() {
		System.out.println("Please mention the deposit amount:");
		credit = AcCredit.nextInt();
		balance = balance + credit;

	}

	void debit() {
		System.out.println("Please mention the withdrawal amount:");
		debit = Acdebit.nextInt();
		balance = balance - debit;
	}

	void show() {
		System.out.println("Your current balance is: " + balance);
	}

	void display() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Account Name: " + name);
		System.out.println("Your current balance is: " + balance);
	}

}

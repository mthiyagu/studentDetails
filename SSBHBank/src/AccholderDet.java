import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AccholderDet {

	public static void main(String[] args) throws IOException {
		FileWriter fout = new FileWriter("D:\\Thiyagu\\bankdetails.txt", true); // True indicates to append data in a
																				// existing file
		BufferedWriter bw = new BufferedWriter(fout);
		PrintWriter pst = new PrintWriter(bw);
		// To Display local time
		LocalDateTime current = LocalDateTime.now();
		// Format to display the local time
		DateTimeFormatter frmt = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss");
		String datetimeformat = current.format(frmt);
		Scanner scan = new Scanner(System.in);
		int check;
		BankDetails B1 = new BankDetails();
		B1.add();
		do {
			System.out.println("Welcome to SS Bank");
			System.out.println("Please Choose your Option");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Account balance");
			System.out.println("4.Exit");
			check = scan.nextInt();
			switch (check) {
			case 1:

				B1.credit();
				break;

			case 2:

				B1.debit();
				break;

			case 3:

				B1.show();
				break;

			case 4:

				System.out.println("Thank you for banking with us");
				break;

			default:
				System.out.println("Invalid character! Thank you");

			}
		} while (check != 4);

		B1.display();
		pst.println("Current Local Date and Time is : " + datetimeformat);
		pst.println("Account Number: " + B1.accountNumber);
		pst.println("Account Name: " + B1.name);
		pst.println("Your current balance is: " + B1.balance);
		pst.println("--------------------------------------");

		pst.close();
		scan.close();

	}

}

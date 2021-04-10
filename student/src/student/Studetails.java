package student;


import java.util.Scanner;

public class Studetails {

	public static void main(String args[]) {
		Scanner Record = new Scanner(System.in);
		String rec;
		Stud S1 = new Stud();
		do {
			S1.insert();
			System.out.println("Want to add more record? Type y/n : ");
			rec = Record.nextLine();
		} while (!rec.equals("n"));

		/*
		 * switch(rec) { case "y":
		 * 
		 * S1.insert(); break; case "n": System.out.println("Thank you!"); break;
		 * 
		 * default: System.out.println("Invalid ! Thank you!");
		 * 
		 * }
		 */
		Record.close();
		S1.display();
		S1.tot();
		S1.avg();
	}
}

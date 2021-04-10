package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Stud {
	Scanner roll = new Scanner(System.in);
	ArrayList<Integer> rollno = new ArrayList<Integer>();
	Scanner name = new Scanner(System.in);
	ArrayList<String> Studname = new ArrayList<String>();
	Scanner e = new Scanner(System.in);
	ArrayList<Integer> eng = new ArrayList<>();
	Scanner ma = new Scanner(System.in);
	ArrayList<Integer> mat = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> sci = new ArrayList<>();
	ArrayList<Integer> tot = new ArrayList<>();
	ArrayList<Float> avg = new ArrayList<Float>();

	void insert() {

		System.out.println("Enter the roll number: ");
		rollno.add(roll.nextInt());
		System.out.println("Enter the Name: ");
		Studname.add(name.nextLine());
		System.out.println("Enter the English mark: ");
		eng.add(e.nextInt());
		System.out.println("Enter the Maths: ");
		mat.add(ma.nextInt());
		System.out.println("Enter the Science: ");
		sci.add(s.nextInt());

	}

	void display() {
		System.out.println("ROLLNO: " + rollno);
		System.out.println("Name: " + Studname);
		System.out.println("English: " + eng);
		System.out.println("Maths: " + mat);
		System.out.println("Science: " + sci);
	}

	void tot() {
		for (int i = 0; i < rollno.size(); i++) {
			tot.add(eng.get(i) + mat.get(i) + sci.get(i));
		}
		System.out.println("total is: " + tot);

	}

	void avg() {
		for (int i = 0; i < rollno.size(); i++) {
			avg.add((float) (tot.get(i) / 3));
		}
		System.out.println("PERCENTAGE IS: " + avg);
	}

}

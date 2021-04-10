package student;

import java.util.ArrayList;
import java.util.Scanner;

public class Stud {
	Scanner roll = new Scanner(System.in);
	ArrayList<Integer> rollno = new ArrayList<Integer>();
	Scanner name = new Scanner(System.in);
	ArrayList<String> studentName = new ArrayList<String>();
	Scanner e = new Scanner(System.in);
	ArrayList<Integer> english = new ArrayList<>();
	Scanner ma = new Scanner(System.in);
	ArrayList<Integer> maths = new ArrayList<>();
	Scanner s = new Scanner(System.in);
	ArrayList<Integer> science = new ArrayList<>();
	ArrayList<Integer> total = new ArrayList<>();
	ArrayList<Float> average = new ArrayList<Float>();

	void insert() {

		System.out.println("Enter the roll number: ");
		rollno.add(roll.nextInt());
		System.out.println("Enter the Name: ");
		studentName.add(name.nextLine());
		System.out.println("Enter the English mark: ");
		english.add(e.nextInt());
		System.out.println("Enter the Maths: ");
		maths.add(ma.nextInt());
		System.out.println("Enter the Science: ");
		science.add(s.nextInt());

	}

	void display() {
		System.out.println("ROLLNO: " + rollno);
		System.out.println("Name: " + studentName);
		System.out.println("English: " + english);
		System.out.println("Maths: " + maths);
		System.out.println("Science: " + science);
	}

	void tot() {
		for (int i = 0; i < rollno.size(); i++) {
			total.add(english.get(i) + maths.get(i) + science.get(i));
		}
		System.out.println("total is: " + total);

	}

	void avg() {
		for (int i = 0; i < rollno.size(); i++) {
			average.add((float) (total.get(i) / 3));
		}
		System.out.println("PERCENTAGE IS: " + average);
	}

}

package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance;
	private static int costOfCourse = 600;
	private static int id = 1000;

	// Construtor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();

		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();

		System.out.println("1 . Freshmen\n2 . Sophmore\n3 . Junior\n4 . Senior\nEnter studentas class level: ");
		this.gradeYear = in.nextInt();
		setstudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);

	}
	// generate a id
	private void setstudentID() {
		// grade level + id 
		id++;
		this.studentID = gradeYear + "" + id;
	}

	// enroll a course
	public void enroll() {
		//get inside a loop, user hits 0
		do {
			System.out.println("Enter course to enroll (0 to quit): ");
			Scanner in = new Scanner(System.in);
			String course =	in.nextLine();
			if ( !course.equals("Q")) {
				courses = courses + "\n" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				//System.out.println("BREAK");
				break; }
		} while(1 != 0);
		System.out.println("Enrolled In: " + courses);
		//System.out.println("Tuition Balance: " + tuitionBalance);
	}

	//view balance
	public void viewBalance() {
		System.out.println("Your balance is: $"+ tuitionBalance);
	}

	//pay tution 
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}

	//show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGradeLevel:" + gradeYear +
				"\nStudent ID: " + studentID +
				"\nCouses Enroolment: "+ courses +
				"\nBalance: " + tuitionBalance;

	}

















}

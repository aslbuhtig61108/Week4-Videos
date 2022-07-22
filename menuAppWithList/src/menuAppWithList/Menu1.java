package menuAppWithList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu1 {

	static Scanner scanner = new Scanner(System.in); // moving to the class level to give access
	static List<String> students  = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		/* 
		 * This lecture demonstrates the use of a list to
		 * create a Menu App
		 *
		 */
		
		
		// we initialize an integer as the placeholder for the user's menu selection
		int choice = 0;
		
		// Having a menu that is available to the user until they exit is beneficial
		// Using a while loop statement helps with this action
		while (choice != 4) {
			
			/*
			 * Using a method to save time and modularize repeating actions is important for
			 * clean and neatly organized code base
			 * The showMenu() method displays the menu interface to the user until they
			 * decide to exit out
			 */
			showMenu();
			
			choice = getUserChoice();
			if (choice == 1) {
				printStudentNames();
			} else if (choice == 2) {
				addNewStudent();
			} else if (choice == 3) {
				deleteStudent();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please select a valid option!");
			}
			
			
			
			
		}

	}
	/*
	 * Here is our showMenu() method. All it wil do is present the user interface It
	 * is a void method, therefore, no value is returned
	 */
	public static void showMenu() {
		System.out.println("1) Print Student Names");
		System.out.println("2) Add New Student");
		System.out.println("3) Delete Student at Position");
		System.out.println("4) Exit1");
		System.out.println("==============================");
	
	}

	/*
	 * Calling this method() captures the user's selection and returns the value to the main
	 * class.
	 * 
	 */
	 	public static int getUserChoice() {
		return scanner.nextInt();
	 	}
	
		/*
		 * Calling this method() prints all the students' names to the console
		 */
	 	public static void printStudentNames() {
	 		for (String student : students) {  
	 			System.out.println(student);
	 		}
	 	}

		/* 
		 * Calling this method() adds a student name to the array list 
		 */
	 	public static void addNewStudent() {
	 		System.out.print("Enter the name you would like to add : ");
	 		String name = scanner.next(); // We can decrease our line code by combinning
	 		students.add(name); // these two lines into one
	 		// students.add(scanner.next()); alternative option
	 		// But if you want to add a line that says "you captured ______." you will need
	 		// the above lines 87 and 88
	 		System.out.println("Student added : " + name);
	 	}
	 	
	 	/* 
		 * Calling this method() deletes a student's name from our array list 
		 */
	 	public static void deleteStudent() {
	 		System.out.println("Enter the index of the student you wish to delete : ");
	 		// we need to capture the index the user wishes to delete
	 		// let's use our scanner method
	 		int index = getUserChoice();
	 		if (index <= students.size()) {
	 			students.remove(index);
	 		} 
	 		
	 		
	 	}
	 	
}

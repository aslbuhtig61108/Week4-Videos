import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Menu2 {

	static Scanner scanner = new Scanner(System.in);
	static Map<String, String> phoneBook = new HashMap<String, String>();
	
	
	
	public static void main(String[] args) {
		/*
		 * LIke we did with our student menu app, we are going to apply Maps
		 * This menu app utilizes the Map collection and associate a student name with a phone number or an email adderss
		 */
		int choice = 0;
		
		while (choice != 4) {
			printMenu();
			choice = getUserChoice();
			
			if (choice == 1) {
				displayPhoneBook();
			} else if (choice == 2) {
				addContact();
			} else if (choice == 3) {
				deleteContact();
			} else if (choice == 4) {
				System.out.println("Goodbye!");
			} else {
				System.out.println("Please pick a valid option!");
			}
		}
	}

	// Outside of our main method we start to implement our method()
	public static void printMenu() {
		System.out.println("1) Display Phone Book");
		System.out.println("2) Add New Contact");
		System.out.println("3) Delete Contact");
		System.out.println("------------------------");
	}
	
	public static int getUserChoice() {
		return scanner.nextInt();
	}
	
	public static void displayPhoneBook() {
		Set<String> phoneNumbers = phoneBook.keySet();
		for (String number : phoneNumbers) {
			System.out.println(number + " : " + phoneBook.get(phoneNumbers));
		}
	}
	
	public static void addContact() {
		System.out.print("Enter Phone Number : ");
		String phoneNumber = scanner.next(); // you can reuse the variable name in a different method
		System.out.print("Enter Name : ");
		String name = scanner.next();
		phoneBook.put(phoneNumber, name);
		System.out.println("Added " + phoneNumber + " : " + name);
	}
	
	public static void deleteContact() {
		System.out.println("Enter Phone Number to Delete : ");
		String phoneNumber = scanner.next();
		System.out.println("Removed : " + phoneNumber + " : " + phoneBook.remove(phoneNumber));
	}
}
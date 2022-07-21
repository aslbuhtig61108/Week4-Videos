import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Arrays have pros and cons depending on what you use them for
		// Arrays require their size set
		// they can't increase or decrease their size
		// you must reference the index of an array to manipulate any element of the array
		
		String[] cars = new String[3];
		cars[0] = "Camaro";
		cars[1] = "F150";
		cars[2] = "Mustang";
		
		// unable to add a value at any index
		
		// A LIST is a different data structure like an array allows to store data together
		// like an array but overcomes some limitations of an array
		// A list is an interface (can't create an object from a list 
		// but from a class that implements a list
		// SYNTAX: List<data type> variable name = new <data type>; 
		// IMPORT : java.util.List; java.util.ArrayList;
		
		
		// LIST METHODS AVAILALBLE
		// .add(data type of list);
		// .remove (object);
		// .remove (index);
		// .size (int);
		// .get (index);
		// .isEmpty(boolean);
		// 
		//
		
		
			
		List<String> sports = new ArrayList<String>();
		sports.add("Wrestling");
		sports.add("Soccer");
		sports.add("Football");
		

		// Traditional FOR Loop
		// for (int i = 0; i < sports.size) i++) {
		// System.out.println(sports.get(i));
		// }

		// ENHANCED FOR Loop
		for (String sport : sports) {
			System.out.println(sport);
		}
		
		// List<int> numbers = new ArrayList<int>; We cannot use primitive data types
		// Each primitive data type has a corresponding data type class
		List<Integer> numbers = new ArrayList<Integer>();
				
	}

	}



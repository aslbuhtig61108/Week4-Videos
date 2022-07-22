import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collect {

	public static void main(String[] args) {
		// A list is an interface
		// Arraylist is type of a list, an implementation of a list
		// A list is a type of collections
		// Commonly used collections
		// 3 SUBSETS: list, sets, maps
		
		
		/*
		 * LIST 
		 * allows duplicates
		 * sequence of entry is organized by an index and kept and accessed similar to an array
		 * allows null values
		 * Common implementations: ArrayList (common), LinkedList, Vector have own implementations of the List interface
		 * 
		 */		
		List<String> students = new ArrayList<String>();
		students.add("Rob");
		students.add("Rob");
		students.add("Sam");
		students.add(null); 
		
		for (String student : students) {
			System.out.println(student);  // clearly LISTS allows duplicates
		}
		
		System.out.println(students.get(2)); // Sam
		System.out.println(students.get(0)); // Rob
		
		
		/* 
		 * SET
		 * No duplicates 
		 * import java.util.Set and java.util.HashSet
		 * unordered list
		 * Common implementations: HashSet (common), LinkedSet, TreeSet
		 * 
		 * 
		 * SET Methods()
		 * .add 
		 * .size 
		 * .contains() - to check if a set contains something
		 * .isEmpty()
		 * .remove()
		 * 
		 */
		Set<String> states = new HashSet<String>();
		states.add("Alabama");
		// states.add("Alabama");
		states.add("Alaska");
		states.add("Arizona");
		states.add("Arkansas");
		states.add("California");
		states.add(null);
		
		// Using .size()
		System.out.println(states.size());
		
		// Using .contains() returns a boolean value
		System.out.println(states.contains("Delaware"));  // false
		System.out.println(states.contains("Alabama"));   // true
		
		// Using .remove(). Can use if a conditiol such if contains a phone# then call. or if contains email then send message
		if (states.contains("Alabama")) {
			states.remove("Alabama");
		}
		
		
		for (String state : states) {
			System.out.println(state);  // only prints one duplicate proving Sets don't allow duplicates
		}
				
		
		/*
		 * MAP
		 * SYNTAX: Map<key data type, value data type> = var name = new HashMap<key data type, value data type>();
		 * has two elements for each entry: key value pairs like a dictionary
		 * Parameters(key, value)
		 * Import: java.util.Map and java.util.HashMap
		 * looks like a list that uses an index, but more valuable when soley based on an sequence
		 * Values can be duplicates, but not the (unique) key
		 * Common implementations: HashMap (common), LinkedHashMap, TreeMap, Hashtable
		 * 
		 * 
		 * MAP Methods()
		 * .put((key, value) = allows you to add an entry to a map
		 * .get(key) - returns the corresponding value
		 * .isEmpty() - like List, it will tell you if a map is empty or not
		 * .keySet() - grabbed a collection of all the keys
		 * .remove() - allows you to pass in a key to remove a Map entry
		 * .size() - like list and set, shows the size of the Map or the number of elements
		 * .values() - it reiterates the values of a collection 
		 *    - similar to keyset but it returns a collection of the values
		 *    - create Collection
		 *    - import java.util.Collection
		 * 
		 */
		
		Map<Integer, String> racerPlacements = new HashMap<Integer, String>();
		racerPlacements.put(1, "Tommy");
		racerPlacements.put(2,  "Sally");
		racerPlacements.put(3, "John");
		
		Map<String, String> dictionary = new HashMap<String, String>();
		dictionary.put("Augment", "make (something) greater by adding to it; increase.");
		dictionary.put("diminish", "make or become less.");
		dictionary.put("ostentatious", "characterized by vulgar or pretentious display; designed to impress or attract notice.");
		
		System.out.println(racerPlacements.get(1));
		
		// Using the .remove() method
		racerPlacements.remove(1);
		
		
		/*
		 * Using the .keySet()
		 */
		Set<Integer> racerKeys = racerPlacements.keySet();
		for (Integer key : racerKeys) {
			System.out.println(key + " : " + racerPlacements.get(key)); // can also pass the key to the get() to get value
		}
		
		/*
		 * Using .values
		 */
		Collection<String> racers = racerPlacements.values();
		for (String racer : racers) {
			System.out.println(racer);
		}
		
		/*
		 * CONCLUSION
		 * differences between them are important
		 * when to use them depends on what they allow
		 * LIST - allows duplicates and keeps in order.. defaults to "order of entry"
		 * SET - no duplicates and order is not needed
		 * MAP - very useful when you need to associate key-value pairs examples dictionary or phone book
		 * 
		 * 
		 */
		
		

	}

}


public class StrBuilr {

	public static void main(String[] args) {
		/*
		 * demo on "+" concatenation of two strings
		 */
		
		String firstName = "Sally";
		String lastName = "Smith";
		System.out.println(firstName + " " + lastName);
		
		/*
		 * runing the method we created "multiplyingString"
		 */
		String tripleHi = multiplyingString("Hi", 3);
		System.out.println(tripleHi);
		
		System.out.println(firstName.concat(lastName));
		System.out.println(firstName); // this line hasn't changed the value of the firstName, it still Sally, it doesn't change
		// the value. STRINGS ARE IMMUTABLE.That new string in memory and assign it to a the same variable, but the old string
		// is still existing memory.. All the strings created are all in memory, which is called a memory leak
		
		// When should be a string be used? Answer: Strings are very useful in programming and should only used them 
		// when you have a value that is not going to change a bunch
		
		// Like if you're going to be combining char and strings together, a string is not the object type you want to use
		// you would like to use a STRINGBUILDER
				
		StringBuilder fullName = new StringBuilder("Sam");
		fullName.append(" Smith");
		System.out.println(fullName.toString()); // when appending to a stringbuilder we are not creating
		// multiple strings in memory
		
		// CONCLUSION: A string is immutable and a stringbuilder is mutable. 
		// A stringbuilder allows you to manipulate the parts of a string and that convert the final 
		// product to a string without the overhead of a string. 
		// Use a stringbuilder when you need to manipulate a string dynamically and a string if you have a constant
		
		/*
		 * COMMON METHODS() OF A StringBuilder
		 * .append()
		 * .charAt(index);
		 * .delete(int start, int end);
		 * .delete.charAt();
		 * .indexOf(location of string);
		 * .replace(int start, int end, string);
		 * .reverse(string);
		 * .toString(); useful at the very end after the final string is created and return to a string after no more changes
		 * 
		 */
		
//		System.out.println(fullName.charAt(5));
//		System.out.println(fullName.deleteCharAt(5));
//		System.out.println(fullName.delete(1,3));
		System.out.println(fullName.indexOf("it"));
		System.out.println(fullName.replace(4, 9, "Thompson"));
		System.out.println(fullName.reverse());
		
		}
	/*
	 * another example is a string that gets concatenated to itself
	 */
	
//	public static String multiplyingString(String str, int num) {
//		String result= "";
//		for (int i = 0; i < num; i++) {
//			result += str;
//		}
//		return result;
//	}

	/* 
	 * let's apply the Stringbuilder to the previous method
	 */
	public static String multiplyingString(String str, int num) {
		StringBuilder result= new StringBuilder();
		for (int i = 0; i < num; i++) {
			result.append(str);
		}
		return result.toString();
	}

	
	
	
	

	}



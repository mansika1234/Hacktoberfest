// Java program to Compare two strings 
// lexicographically 
public class Compare_strings { 

	public static int stringCompare(String str1, String str2) 
	{ 

		int l1 = str1.length(); 
		int l2 = str2.length(); 
		int lmin = Math.min(l1, l2); 

		for (int i = 0; i < lmin; i++) { 
			int str1_ch = (int)str1.charAt(i); 
			int str2_ch = (int)str2.charAt(i); 

			if (str1_ch != str2_ch) { 
				return str1_ch - str2_ch; 
			} 
		} 

		if (l1 != l2) { 
			return l1 - l2; 
		} 

		// If none of the above conditions is true, 
		// it implies both the strings are equal 
		else { 
			return 0; 
		} 
	} 

	// Driver function to test the above program 
	public static void main(String args[]) 
	{ 
		String string1 = new String("Pizza"); 
		String string2 = new String("fruits"); 
		String string3 = new String("Pizzasauce"); 
		String string4 = new String("fruity"); 

		// Comparing for String 1 < String 2 
		System.out.println("Comparing " + string1 + " and " + string2 
						+ " : " + stringCompare(string1, string2)); 

		// Comparing for String 3 = String 4 
		System.out.println("Comparing " + string3 + " and " + string4 
						+ " : " + stringCompare(string3, string4)); 

		// Comparing for String 1 > String 4 
		System.out.println("Comparing " + string1 + " and " + string4 
						+ " : " + stringCompare(string1, string4)); 
	} 
} 

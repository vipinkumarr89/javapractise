package Edureka;

public class MutableStrings {

	public static void main(String[] args) {
		
		// IMMUTABLE they remain constant and cannot be modified
		String str = new String("John");
		str.concat(" wick");
		System.out.println("str is: "+str);

		String str1 = str.concat(" Watson"); // Concatenating a String as in a new String
		System.out.println("str1 is: "+str1);
		
		
		// MUTABLE  Contents can be modified
		StringBuffer buffer = new StringBuffer("Jennie");  // THREAD-SAFE (SYNCHRONIZED)
		buffer.append(" Watson");
		System.out.println("buffer is: "+buffer);

		// MUTABLE  Contents can be modified
		StringBuilder builder = new StringBuilder("Jack"); // NOT THREAD-SAFE (NOT SYNCHRONIZED)
		builder.append(" Watson");
		System.out.println("builder is: "+builder);
	}

}

package String;

public class Addastric {

	public static void main(String[] args) {
	    String s = "aaaa";
	    if (s == null || s.length() == 0) return;

	    StringBuilder sb = new StringBuilder();
	    
	    // Add the first character to start
	    sb.append(s.charAt(0));

	    // Start loop from the second character (index 1)
	    for (int i = 1; i < s.length(); i++) {
	        // Compare current character with the PREVIOUS one
	        if (s.charAt(i) == s.charAt(i - 1)) {
	            sb.append("*");
	        }
	        sb.append(s.charAt(i));
	    }

	    System.out.println(sb.toString()); // Output: a*a*a*a
	}
}
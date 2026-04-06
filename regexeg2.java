package regexexp;

import java.util.regex.Pattern;

public class regexeg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pattern=".*nu.*";
		String content="manuel";
		boolean flagout=Pattern.matches(pattern,content);
		
		System.out.println("do the text contains park??"+flagout);
				

	}

}

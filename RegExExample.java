package regexexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern pattern =Pattern.compile("l......");
		Matcher matcher=pattern.matcher("luminar");
		boolean flag=matcher.matches();
		System.out.println("result="+flag);
		boolean flagout=Pattern.compile("m.....").matcher("manuel").matches();
		System.out.println("flagout"+flagout);
		
		boolean flagout2=pattern.matches(".*l","manuel");
		System.out.println("flagout"+flagout2);
	}

}
   
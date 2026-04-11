package regexexp;

import java.util.regex.Pattern;

public class RegexMetaChar {

	public static void main(String[] args) {
		System.out.println("excactly");
		System.out.println(Pattern.matches("\\D{3}","abc"));
		System.out.println("ab".matches("\\D{3}"));
		System.out.println("abc".matches("\\D{3}"));
		
		//atlest 2
		System.out.println("atleast");
		System.out.println(Pattern.matches("\\D{2,}","c"));
		System.out.println(Pattern.matches("\\D{2,}","cbns"));
		
		//in betwenn 
		System.out.println("in between");
		System.out.println(Pattern.matches("\\D{2,4}", "abc"));
		System.out.println(Pattern.matches("\\D{2,4}", "abcdd"));
		
		//one or more than one
		
		System.out.println("one or more than one");
		System.out.println(Pattern.matches("\\d+", "123"));
		System.out.println(Pattern.matches("\\d+", ""));
		

	}

}

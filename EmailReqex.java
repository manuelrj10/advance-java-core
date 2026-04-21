package regexexp;

import java.util.regex.Pattern;

public class EmailReqex {

	public static void main(String[] args) {
		String email="manuelrajesh345@gmail.com";
		boolean flag=Pattern.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$",email);
		if(flag) {
			System.out.println("valid email");
		}
		else {
			System.out.println("invalid");
		}

	}

}

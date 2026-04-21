package regexexp;

import java.util.regex.Pattern;

public class IpvalidationRegex {

	public static void main(String[] args) {
		boolean flag=Pattern.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$","192.168.1.1");
		if(flag) {
			System.out.println("valid ip");
		}
		else {
			System.out.println("invalid");
		}


	}

}

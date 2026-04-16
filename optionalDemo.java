package optionalpack;

import java.util.Optional;

public class optionalDemo {

	public static void main(String[] args) {
		
		//optional object of string
		Optional<String> ofc=Optional.of("luminar technolab");
		//optional.empty() creates an empty optional object
		Optional<String> nothing=Optional.empty();	
		
		System.out.println("present??");
		if(ofc.isPresent()) {
			System.out.println("i am present");
		}
		else {
			System.out.println("i am home");
		}
		
		System.out.println(ofc.orElse("i am home !!! dont disturb"));
		System.out.println(nothing.orElse("yo i am back"));
		

	}

}

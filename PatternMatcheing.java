package optionalpack;

public class PatternMatcheing {

	public static void main(String[] args) {
		Object obj="manuel";
		if(obj instanceof String) {
			String s=(String)obj;
			System.out.println(s.toUpperCase());
			System.out.println(s.toLowerCase());
			
		}
		Object obj1="manuelRAjesh";
		if(obj1 instanceof String s1) {
			
			System.out.println(s1.toUpperCase());
			System.out.println(s1.toLowerCase());
			
		}
		
		

	}

}

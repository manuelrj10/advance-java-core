package lambdapack;
@FunctionalInterface
interface Myinterface{
	String reverseString(String s);
}

public class LambdaWithParametre {

	public static void main(String[] args) {
		
		
		Myinterface myinter=(str)->{
			String reverse="";
			for(int i=0;i<str.length();i++){
				reverse=str.charAt(i)+reverse;
				
			}
			return reverse;
		};
		System.out.println(myinter.reverseString("manuel"));
		
	}

}

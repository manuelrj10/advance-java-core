package lambdapack;

@FunctionalInterface
interface GenenricMyInterface<H> {
	H method(H t);

}

public class GenericFunctionalLambda {

	public static void main(String[] args) {
		
		//String reverse
		GenenricMyInterface<String> rev = (str) -> {

			String result = "";
			for (int i = str.length() - 1; i >= 0; i--) {
				result += str.charAt(i);
			}
			return result;

		};

		System.out.println("string reverse  :" + rev.method("manuel"));
		
		//factorial
		GenenricMyInterface<Integer> factorial=(num)->{
			int fact=1;
			for(int i=1;i<=num;i++) {
				fact=fact*i;
			}
			return fact;
			
		};
		System.out.println("factorial  :"+factorial.method(5));
		
		//number reverse
		
		GenenricMyInterface<Integer> numRev=(num)->{
			int rev1=0;
			int rem=0;
			while(num>0) {
				rem=num%10;
				rev1=rev1*10+rem;
				num=num/10;	
			}
			return rev1;
			
		};
		System.out.println("reverse num :"+numRev.method(588));
		
		
		
		

	}

}

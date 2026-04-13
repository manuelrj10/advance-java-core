package lambdapack;

@FunctionalInterface
interface DemoInterface{
	double getPivalue();
}
public class LambdaNoParametrre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DemoInterface di;
		
		
		di=()->3.14;
		System.out.println(di.getPivalue());
		

	}

}

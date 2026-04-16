package methodreferncepack;

@FunctionalInterface
interface Display{
	void getName(String name);
}


public class MethodReferenceInstanceMethod {
	
	public static void getInfo(String info) {
		System.out.println("info "+info);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Display d=(s)->System.out.println(s);
		d.getName("manuel");
		
		//method reference
		
		Display dis=MethodReferenceInstanceMethod::getInfo;
		dis.getName("simon");
		

	}

}

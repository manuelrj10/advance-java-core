package collextion;
import java.util.Hashtable;
import java.util.Vector;


public class BeforeJCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[] {1,2,3,4,5};
		
		Vector v=new Vector();
		
		Hashtable<Integer,String> h=new Hashtable();
		
		v.addElement(1);
		v.addElement(2);
		
		
		h.put(1,"luminar");
		h.put(2,"java");
		
		System.out.println(arr[4]);
		System.out.println(v.elementAt(0));
		System.out.println(h.get(1));

	}

}

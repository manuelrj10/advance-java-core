package collextion;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPreSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List lst=new ArrayList();
lst.add("manuel");
lst.add("rajesh");
lst.add("sharan");
Iterator itr=lst.iterator();
while(itr.hasNext()) {
	String str=(String)itr.next();
	System.out.println(str);
}
	}

}

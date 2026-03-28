package collextion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeSpecifiactionList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst=new ArrayList<String>();
		lst.add("hi");
		lst.add("manuel");
		lst.add("rajesh");
		Iterator itr=lst.iterator();
//		while(itr.hasNext()) {
//			if(itr.next().equals("hi")) {
//				itr.remove();
//			}
//		}
		for(String str:lst) {
			System.out.println(str);
		}
		System.out.println(lst);

	}

}

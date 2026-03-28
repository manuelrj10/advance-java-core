package collextion;

import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;

public class TestHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> set=new HashSet<String>();
		set.add("java");
		set.add("jsp");
		set.add("hibernate");
		set.add("jsp");
		set.add("java");
		set.add("java");
		System.out.println(set);
		Enumeration e=Collections.enumeration(set);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		

	}

}

package collextion;

import java.util.ArrayList;
import java.util.List;

public class StringBuilderModify {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<StringBuilder> lst=new ArrayList<StringBuilder>();
		lst.add(new StringBuilder("java"));
		lst.add(new StringBuilder("hibernet"));
		lst.add(new StringBuilder("technolab"));
		System.out.println(lst);
		for(StringBuilder sb:lst) {
			sb.append("kochi");
		}
		System.out.println(lst);
	}

}

package collextion;

import java.util.Map;
import java.util.HashMap;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> map=new HashMap<String,String>();
		map.put("java","8 months");
		map.put("java","9 months");
		map.put("js","28 months");
		map.put("python","19 months");
		System.out.println(map);
		System.out.println(map.get("js"));
		
		

	}

}

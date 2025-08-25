package javaProject;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
//import java.util.;

public class HashMapExample {

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<String, Integer>();
		mp.put("test1" , 10);
		mp.put("test2", 11);
		mp.put("test3", 12);
		
		System.out.println(mp);
		Set<Map.Entry<String,Integer>> set = mp.entrySet();
		Iterator<Map.Entry<String , Integer>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
}
 
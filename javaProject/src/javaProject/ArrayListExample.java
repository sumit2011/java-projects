package javaProject;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(19);
		list.add("hiii");
		list.add(70);
		list.add(null);
//		list.add(list);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			Object obj = itr.next();
			System.out.println(obj);
			if(obj instanceof Integer) {
//				System.out.println(obj);
			}
		}
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("hii");
		list2.add("sumi");
		for(String obj: list2) {
			System.out.println(obj);
		}
	}
}

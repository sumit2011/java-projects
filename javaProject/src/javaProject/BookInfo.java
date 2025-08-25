package javaProject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class BookInfo {

	public static void main(String[] args) {
		
		System.out.println("Enter the book information: ");
		
		Map<Integer,Book> bookList = new HashMap<Integer,Book>();
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0 ; i<1 ; i++) {
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Book Title: ");
			String title = sc.nextLine();
			System.out.print("Book author: ");
			String author = sc.nextLine();
			System.out.print("Price: ");
			int price = sc.nextInt();
			sc.nextLine();
			
			bookList.put(id , new Book(id, title, author,price));
			
		}
		
//		System.out.println(bookList);
		Set<Entry<Integer, Book>> set = bookList.entrySet();
		Iterator<Entry<Integer, Book>> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}
	
}

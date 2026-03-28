package collextion;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Book {
	String BookName;
	String autherName;
	float bookPrice;

	public Book(String BookName, String autherName, float bookPrice) {
		this.BookName = BookName;
		this.autherName = autherName;
		this.bookPrice = bookPrice;
	}
}

public class BookHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String BookName;
		String autherName;
		float bookPrice;
		boolean loopagain = false;
		char choice;
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Book> map=new HashMap<Integer,Book>();

		int bookId;
		do {
			System.out.println("enter the book number");
			bookId = sc.nextInt();
			System.out.println("enter the BookName ");
			sc.nextLine();
			BookName = sc.nextLine();
			System.out.println("enter the Author Name ");
			
			
			autherName = sc.nextLine();
			System.out.println("enter the book price");
			bookPrice = sc.nextFloat();
			
			map.put(bookId,new Book(BookName,autherName,bookPrice));

			System.out.println("press (y/Y) to continue");
			choice = sc.next().charAt(0);
			if (choice == 'Y' || choice == 'y') {
				loopagain = true;
			} else {
				loopagain = false;
			}

		} while (loopagain);
		for(Map.Entry<Integer,Book> entry:map.entrySet()) {
			int key=entry.getKey();
			Book book=entry.getValue();
			System.out.println(key+"details");
			System.out.println(book.BookName+"   "+book.autherName+"   "+book.bookPrice);
			System.out.println("\n");
		}

	}

}

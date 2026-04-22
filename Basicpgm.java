package collextion;

import java.util.Scanner;

public class Basicpgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the age");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the city");
		String city=sc.nextLine();
		System.out.println("name"+name);
		System.out.println("age"+age);
		System.out.println("city"+city);
		sc.close();
	}

}

package collextion;

import java.util.HashMap;
import java.util.Scanner;

public class StudentHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int studentid;
		String studentName;
		char choice;
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		boolean loopagain=false;
		
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("enter the student number");
			studentid=sc.nextInt();
			System.out.println("enter the student name ");
			sc.nextLine();
			studentName=sc.nextLine();
			
			
			map.put(studentid,studentName);
			System.out.println("press (y/Y) to continue");
			choice=sc.next().charAt(0);
			if(choice=='Y'||choice=='y') {
				loopagain=true;
			}
			else {
				loopagain=false;
			}
			
			
			}while(loopagain);
		
		System.out.println(" student details");
		for(int key:map.keySet()) {
			System.out.println("student name  "+key+"  student name "+map.get(key));
			
		}
		
		

	}

}

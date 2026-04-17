package optionalpack;



record Student(int rollno,String name) {}

public class RecordDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student(1,"manuel");
		System.out.println("roll no"+s.rollno());
		System.out.println("name "+s.name());
		System.out.println(s);
		

	}

}

package methodreferncepack;
@FunctionalInterface
interface EmployeeDetails{
	public Employee getEmployee();
	
}

@FunctionalInterface
interface CompanyDetails{
	public Employee getEmployee(int empNo,String empName);
}
class Employee{
	int empNo;
	String empName;
	
	Employee(){
		System.out.println("hi manuel");
	}
	Employee(int empNo,String empName){
		this.empNo=empNo;
		this.empName=empName;
	}
	void display() {
		System.out.println("employee details");
		System.out.println(empNo);
		System.out.println(empName);
	}
}
public class ConstructorReference {

	public static void main(String[] args) {
		Employee emp=new Employee();
		EmployeeDetails empDetail=Employee::new;
		empDetail.getEmployee().display();
		
		CompanyDetails cmpDetail=Employee::new;
		cmpDetail.getEmployee(1, "manuel").display();

	}

}

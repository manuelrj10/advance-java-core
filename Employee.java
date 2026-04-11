package serializedeserializepack;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int empId;
	String empName;
	Employee(int empId,String empName){
		this.empId=empId;
		this.empName=empName;
	}

}

package serializedeserializepack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizeEmployee {

	public static void main(String[] args) {
	Employee emp=new Employee(211,"manuel");
	FileOutputStream fout=null;
	ObjectOutputStream out=null;
		try {
			fout=new FileOutputStream("C:\\Users\\manue\\Desktop\\luminar\\employee.txt");
			out=new ObjectOutputStream(fout);
			out.writeObject(emp);
			System.out.println("object pressited");
	}catch(IOException io) {
		io.printStackTrace();
	}

	}

}

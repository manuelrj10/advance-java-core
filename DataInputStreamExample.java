package iopack;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) {
		int rollNO=0;
		String name="";
		float mark=0.0f;
		double fees=0.0;
		
		System.out.println("input rollno name marks and fees");
		try(DataInputStream dis=new DataInputStream(System.in)){
//			rollNO=dis.readInt();
//			name=dis.readLine();
//			mark=dis.readFloat();
//			fees=dis.readDouble();
			
			rollNO=Integer.parseInt(dis.readLine());
			name=dis.readLine();
			mark=Float.parseFloat(dis.readLine());
			fees=Double.parseDouble(dis.readLine());
			
			
			
		}catch(IOException io) {
			io.printStackTrace();
		}
		System.out.println(rollNO);
		System.out.println(name);
		System.out.println(mark);
		System.out.println(fees);
		
		

	}

}

package iopack;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int charData;
		try(FileReader fr=new FileReader("C:\\Users\\manue\\Desktop\\luminar\\input.txt");
				FileWriter fw=new FileWriter("C:\\Users\\manue\\Desktop\\luminar\\output.txt")){
			
		while((charData=fr.read())!=-1) {
			fw.write(charData);
			System.out.print((char)charData);
						
			
			
		}
		System.out.println("  text copied");
		}
		catch(IOException io) {
			io.printStackTrace();
			
		}
				

	
	}
}

package iopack;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\manue\\Desktop\\luminar\\input.txt"));
				BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\manue\\Desktop\\luminar\\output.txt"))){
			String line;
			bw.write("hi");
			while((line=br.readLine())!=null) {
				bw.write(line);
				bw.newLine();
				System.out.println(line);
				
			}
			
			System.out.println("buffered copy");
		}
		catch(IOException io) {
			io.printStackTrace();
		}

	}

}

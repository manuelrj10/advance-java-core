package iopack;

import java.io.FileInputStream;
import java.io.FileOutputStream; 
import java.io.IOException;

public class BytteoutputStream {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null; // Use Outputstream here
        int byteData;

        try {
            
            fis = new FileInputStream("C:\\Users\\manue\\Desktop\\luminar\\input.txt");
         
            fos = new FileOutputStream("C:\\Users\\manue\\Desktop\\luminar\\output.txt");

          
            while ((byteData = fis.read()) != -1) {
                fos.write(byteData);
            }
            
            System.out.println("File copied successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 
            try {
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
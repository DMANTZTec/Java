package streams;
import java.io.*;
public class c {
	public static void main(String args[]) throws FileNotFoundException,IOException{  // to handle excepions
		FileInputStream fis=new FileInputStream("abc.txt"); //creating input stream object
		FileOutputStream fos=new FileOutputStream("write.txt"); //creating output stream obj/ect
		int data;
		while( (data=fis.read())!=-1) //in this we are reading complete data in data variable
		{
			fos.write(data); // in this we are copying read data into the file
		}
		System.out.println("copied");
		fis.close();
		fos.close();
		
	}
}

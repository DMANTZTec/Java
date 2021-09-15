package stream;
//File Copy
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//creat class 
public class Filecopy {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// To handle exceptions
		FileInputStream fis=new FileInputStream("io.txt");//creat FileInputStream class Object
		
		FileOutputStream fos=new FileOutputStream("praj.txt");//Creat FileOutputStream class Object
		int data;
		while((data=fis.read())!=-1)// Read the data from the file "io.txt"
		{
			fos.write(data);//write the data to "praj.txt" file
		}
    System.out.println("File copy Successfully"); 
	}

}

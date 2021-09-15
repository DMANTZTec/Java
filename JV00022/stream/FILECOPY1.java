package stream;
//File Copy Dynamically Using Commandline Args
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//creat class 
public class FILECOPY1 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// To handle exceptions
		FileInputStream fis=new FileInputStream("arg[0]");//creat FileInputStream class Object
		
		FileOutputStream fos=new FileOutputStream("arg[1]");//Creat FileOutputStream class Object
		int data;
		while((data=fis.read())!=-1)// read the data
		{
			fos.write(data);//write the data 
		}
    System.out.println("File copy Successfully"); 
	}
}
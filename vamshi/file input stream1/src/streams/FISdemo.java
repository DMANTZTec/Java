package streams;
import java.io.*;
public class FISdemo {

	public static void main(String[] args) throws FileNotFoundException,IOException { //to handle FileNotFoundException,IOException
		FileInputStream fis=new FileInputStream("C://Users//admin//eclipse-workspace//abc.txt"); //creating object for file input stream by passing file as argumen
		
		int data=fis.read(); //it reads file data and storing in data object
		while((data=fis.read())!=-1) //in this we are storing complete data in data variable
		{
			System.out.println((char)(data)); //it prints the data in character data type
			
		}
		fis.close();//closing the connection
		
		
		
	}

}
 
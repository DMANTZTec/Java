package stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		//TO handle Exceptions
		FileOutputStream fos=new FileOutputStream("nnn.txt");//creat FileOutputStream class object and connecting to the file if the file doesnot exist
		//default constructor creates the file 
		 fos.write(100);// To write byte data into the file
		 System.out.println("data is saved");
		fos.close();//To close the connection

	}

}

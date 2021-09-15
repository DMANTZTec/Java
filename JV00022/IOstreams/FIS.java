package using;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIS {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// handle FileNotFoundException,IOException
     
		FileInputStream fis= new FileInputStream("nihal.txt");//create FileInputclass objectby passing filename as arg
		int data=fis.read();//read() method to read the file
		System.out.println("data:"+data);//display the byte data return from the file
		fis.close();//to close connection
	}

}

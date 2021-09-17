package streams;

import java.io.*;
import java.util.*;

public class scannerclass {
	public static void main(String args[]) throws FileNotFoundException,IOException{  // to handle excepions
		Scanner sn=new Scanner(System.in); //creating scanner object
		System.out.println("enter src fil"); //
		String src=sn.nextLine();
		System.out.println("enter destination fil");
		String dest=sn.nextLine();
		
		
	
		FileInputStream fis=new FileInputStream(src); // creating inputfile stream object
		FileOutputStream fos=new FileOutputStream(dest);// creating outputfile stream object
		int data;
		while( (data=fis.read())!=-1) //in this we are storing complete data in data variable
		{
			fos.write(data); // it write data in the form of bytes in given file
		}
		System.out.println("copied");
		fis.close(); // closing input stream connection
		fos.close(); //closing output stream connection
}
	}

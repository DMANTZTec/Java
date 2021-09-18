package streams;
import java.io.*;


public class filecopydynamicallyy {
	public static void main(String args[]) throws FileNotFoundException,IOException{ //to handle exception
		FileInputStream fis=new FileInputStream(args[0]); //creating object input steream
		FileOutputStream fos=new FileOutputStream(args[1]); //creating object for output stream
		int data;
		while( (data=fis.read())!=-1) // //in this we are reading complete data in data variable
		{
			fos.write(data); // it write data in the form of bytes in given file
		}
		System.out.println("copied");
		fis.close(); //closing inputstream connection
		fos.close(); //closing outputstream connection
		
	}


}

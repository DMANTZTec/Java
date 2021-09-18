package streams;
import java.io.*;
public class fosdemo {

	public static void main(String[] args) throws FileNotFoundException,IOException { // //to handle FileNotFoundException,IOException
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("write.txt"); //creating object for fileoutput stream to write into write,txt file
		fos.write(1000);  //it writes 1000 in the form of byte in write.txt
		System.out.println("data is saved");
		fos.close(); //closing the connection

	}

}

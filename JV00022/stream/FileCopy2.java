package stream;
import java.util.*;
import java.io.*;
//Creat Class 
public class FileCopy2 {

	public static void main(String[] args) throws FileNotFoundException,IOException {
		// To handle Exceptions
       Scanner sn=new Scanner(System.in);
       System.out.println("Enter src file");
       String srcFile=sn.nextLine();
       System.out.println("Enter dest file");
       String destFile=sn.nextLine();
       FileInputStream fis=new FileInputStream(srcFile);
       FileOutputStream fos=new FileOutputStream(destFile);
       int data;
       while((data=fis.read())!=-1)
       {
    	   fos.write(data);
       }
       System.out.println("File Copied Successfully");
	}

}

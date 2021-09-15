package stream;
//read data from the file dynamically
//dynamically means as many characters we have, we should read that characters only
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISDynamically {
//handle Exceptions
	public static void main(String[] args) throws FileNotFoundException,IOException{
		FileInputStream fis=new FileInputStream("io.txt");
		int data;
      while((data=fis.read())!=-1)
    		  {
    	  System.out.println("data:"+data+"\t"+(char)data);// to display the 
    		  }
      fis.close();//To close the connection
	}

}

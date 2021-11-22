package Ammu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fistreams {

	public static void main(String[] args)throws FileNotFoundException,IOException {
		// TODO Auto-generated method stub
    FileInputStream fis=new FileInputStream("myfile.txt");
    int data=fis.read();//to read the data

    int data1=fis.read();//to read the data
    System.out.println("data:"+(char)data+(char)data1);// display the data
    fis.close();
	}

}

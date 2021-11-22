package Ammu;
import java.io.*;
public class Iostream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String str= "reading data";
    try
    {
    	new File("C:\\Users\\ADMIN_4\\test.txt").createNewFile();
    	
    	 //Inserting data into a file 
    	FileOutputStream fileOutputStream= new FileOutputStream("C:\\Users\\ADMIN_4\\test.txt");
    	fileOutputStream.write(str.getBytes());
    	//Retrieve data from file 
    	FileInputStream fileInputStream= new FileInputStream("C:\\Users\\ADMIN_4\\test.txt");
    	
    	/*
    	 //reading FIRST CHAR in file
    	int i= fileInputStream.read();
  
    	//converting byte to string
    	System.out.print((char) i);*/
    	
    	int i;
    	//reading whole file
    	while((i=fileInputStream.read())!=-1){
    		System.out.print((char) i);
    	}
    	fileInputStream.close();
    	fileOutputStream.close();
    	//using buffer to enhance system performance
    	
    	/*fileInputStream.close();
    	String s="Changing Data";
    	BufferedOutputStream bufferedOutputStream =new BufferedOutputStream(new FileOutputStream("C:\\Users\\ADMIN_4\\test.txt"));
    	bufferedOutputStream.write(s.getBytes());
    	bufferedOutputStream.close();
    	BufferedInputStream bufferedInputStream =new BufferedInputStream(new FileInputStream("C:\\Users\\ADMIN_4\\test.txt"));
    	int i;
    	while((i=bufferedInputStream.read())!=-1) {
    		System.out.print((char)i);
    	}*/
    	
    	//inserting more than one file
    	
      /*  SequenceInputStream sequenceInputStream = new SequenceInputStream( 
        		new FileInputStream("C:\\Users\\ADMIN_4\\test1.txt"),new FileInputStream("C:\\Users\\ADMIN_4\\test1.txt"));
                int i2;
                while((i2=sequenceInputStream.read())!=-1) {
    		    System.out.print((char)i2);
       }*/
    }
    		catch (IOException e) {
    		System.out.print(e.getMessage());
    	}
    
	   }

		
	}



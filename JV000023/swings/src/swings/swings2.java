package swings;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

class Buttonsframe extends JFrame implements ActionListener // class buttonsframe extending jframe and jframe implementing actionlistener
{
	 static JButton b;
	public Buttonsframe() //creating object for buttons frame
	{
		b=new JButton("click me"); 
		this.setTitle("framework"); //setting title to the frame
		b.setSize(600,600); //setting size for the frame
		this.setLayout(null);
		b.addActionListener(this); //adding object listener to the object b
		this.setVisible(true); //to appear in the window
		this.add(b); //adding button to the frame
		
	}
	
	public void actionPerformed(ActionEvent ae) //for performing action event
	{
		System.out.println("yes dude");
	}
	

}

public class swings2 {

	public static void main(String[] args)  throws NullPointerException{
		
		new Buttonsframe();// calling Buttonsframe costructor
	}

}

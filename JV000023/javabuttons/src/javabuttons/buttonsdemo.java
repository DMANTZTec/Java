package javabuttons;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import java.awt.*;
class Buttonsframe extends JFrame  // class buttonsframe extending jframe action listener 
{
	 static JButton button;
	public Buttonsframe() //creating object for buttons frame
	{
		button=new JButton();
		button=new JButton("click me"); 
		this.setTitle("framework"); //setting title to the frame
		button.setSize(600,600); //setting size for the frame
		this.setLayout(null);
		 //adding object listener to the object b
		this.setVisible(true); //to appear in the window
		this.add(button); //adding button to the frame
		}
	
	


}


public class buttonsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButton();// calling Buttonsframe costructor

	}

}

package swings3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;


	class myframe extends JFrame implements ActionListener //myframe extends jframe and implements action listener
	{
		JTextField textfield;
		JButton button;
		
	myframe() //intialising constructor
	{
		this.setLayout(new FlowLayout()); //adding laayouts tobthe frame
		this.pack();
		this.setVisible(true); //to appear on the window
		textfield=new JTextField(); //creating checkbox
		this.add(textfield); 
		button=new JButton("submit"); //creating buttons
		this.add(textfield); //adding checkbox to the frame
		this.setTitle("textfields1"); //setting title
		textfield.setText("iam not robort"); //adding text to the frame
		textfield.setFocusable(false);
		this.add(button); //adding button to the frame
		button.addActionListener(this); //adding actyionlistener
		
		
		
	}
	public void actionPerformed(ActionEvent e) //performing action methods

	{
		if(e.getSource()==button)
		{
			System.out.println("welcome"+textfield.getText());
		}
	}
	}
	

	
	
		
public class textdemo {
	public static void main(String[] args)
	{
		 new myframe();
	}
}





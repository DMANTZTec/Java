package swings3;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
class myframe extends JFrame implements ActionListener //myframe extends jframe and implements action listener
{
	JCheckBox checkbox;
	JButton button;
	
myframe() //intialising constructor
{
	this.setLayout(new FlowLayout()); //adding laayouts tobthe frame
	this.pack();
	this.setVisible(true); //to appear on the window
	checkbox=new JCheckBox(); //creating checkbox
	this.add(checkbox); 
	button=new JButton("submit"); //creating buttons
	this.add(checkbox); //adding checkbox to the frame
	this.setTitle("checkbox"); //setting title
	checkbox.setText("iam not robort"); //adding text to the frame
	checkbox.setFocusable(false);
	this.add(button); //adding button to the frame
	button.addActionListener(this); //adding actionlistener
	
	
	
}
public void actionPerformed(ActionEvent e) //performing action methods

{
	if(e.getSource()==button)
	{
		System.out.println(checkbox.isSelected());
	}
}

}

public class checkboxdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new myframe();

	}

}

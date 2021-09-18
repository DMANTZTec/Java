package swings;
import javax.swing.*;
import java.awt.*;
class ButtonsFrame extends JFrame // class buttons frame extending jframe
{
	 JButton b;
	 ButtonsFrame() //creating constructor for buttondframe
	{
		this.setTitle("buttons frame"); //setting title for the frame
		setSize(600,600); //setting font size for the frame
		this.setLayout(null);
		b=new JButton("click me"); //
		b.setBounds(100,200,200,20); //setting mesurements for the button
		this.add(b); //adding buttonsframe object b to the current buttonsframe
		this.setVisible(true); //to appear on the window
	}
}
public class swingsdemo {
	public static void main(String[] args) 
	{
		 new ButtonsFrame(); //calling buttonsframe constructor
		}

}

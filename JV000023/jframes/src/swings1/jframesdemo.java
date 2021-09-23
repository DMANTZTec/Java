package swings1;
import javax.swing.*;
import java.awt.*;

public class jframesdemo {

	public static void main(String[] args) {
		JFrame frame = new JFrame();//create a frame
		frame.setVisible(true); //make it visible
		frame.setSize(420,420);// set size for the window
		frame.setTitle("my frame"); //set tititle to the frame
		frame.setResizable(false); // to prevent  frame from being sized
		frame.getContentPane().setBackground(new Color(150,150,150));// change color of back ground
		

	}

}

package layouts;


import javax.swing.*;
import java.awt.*;

public class gridlayoutdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame(); // creating frame
		frame.setVisible(true);//to appear the window
		frame.setSize(500,500); //to set the size
		
		frame.setTitle("grid layouts"); //setting gridlayouts
		frame.setLayout(new GridLayout(3,3,10,10));
		frame.add(new JButton("1")); //adding button 1 to the frame
		frame.add(new JButton("2"));//adding button 2 to the frame
		frame.add(new JButton("3"));//adding button 3 to the frame
		frame.add(new JButton("4"));//adding button 4 to the frame
		frame.add(new JButton("5"));//adding button 5 to the frame
		frame.add(new JButton("6"));//adding button 6 to the frame
		frame.add(new JButton("7"));//adding button 7 to the frame
		frame.add(new JButton("8"));//adding button 8 to the frame
		frame.add(new JButton("9"));//adding button 9 to the frame


	}

}

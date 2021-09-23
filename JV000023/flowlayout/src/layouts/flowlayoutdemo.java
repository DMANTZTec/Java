package layouts;
import javax.swing.*;
import java.awt.*;

public class flowlayoutdemo {

	public static void main(String[] args) {
		new JButton(); //creating button
		JPanel panel=new JPanel(); //creating panel
		panel.setPreferredSize(new Dimension(300,400)); //setting size for panel
		panel.setBackground(Color.white); //setting color for panel
	
	
		JFrame frame=new JFrame(); // creating frame
		frame.setVisible(true);//to appear the window
		frame.setSize(500,500); //to set the size
		frame.add(panel);//addding panel to the frame
		frame.setTitle("flow layouts"); //setting flowlayouts
		frame.setLayout(new FlowLayout());
		panel.add(new JButton("1")); //adding button 1 to the panel
		panel.add(new JButton("2"));//adding button 2 to the panel
		panel.add(new JButton("3"));//adding button 3 to the panel
		panel.add(new JButton("4"));//adding button 4 to the panel
		panel.add(new JButton("5"));//adding button 5 to the panel
		panel.add(new JButton("6"));//adding button 6 to the panel
		panel.add(new JButton("7"));//adding button 7 to the panel
		panel.add(new JButton("8"));//adding button 8 to the panel
		panel.add(new JButton("9"));//adding button 9 to the panel

	}

}

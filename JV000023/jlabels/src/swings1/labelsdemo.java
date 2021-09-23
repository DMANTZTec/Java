package swings1;
import javax.swing.*;
import java.awt.*;

public class labelsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImageIcon image=new ImageIcon("C:/Users/admin/Downloads/naturex27s_canvas_513167.jpg,");
		JLabel label=new JLabel(); //creating label
		label.setText("bro all the best"); //set text of the label
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER); //set text left or right or bottom of image icon
		label.setVerticalTextPosition(JLabel.TOP); //set top or middle or bottom of imgae icon
		label.setIconTextGap(-25); //set distance image to text 
		label.setBackground(Color.black); //set background color
		label.setOpaque(true); //to visble background color
		label.setHorizontalAlignment(JLabel.CENTER); //set horizantal position of text+icon with in a plane
		label.setVerticalAlignment(JLabel.CENTER); //set horizantal position of text+icon with in a plane
		//label.setBounds(100,100,600,600);
		
		JFrame frame =new JFrame(); // create a frame 
		frame.setSize(1000,1000); // setting size of the frame
		frame.setVisible(true); //to appear the frame
		frame.add(label); //adding label to the frame
		//frame.setLayout(null);
		
		

	}

}

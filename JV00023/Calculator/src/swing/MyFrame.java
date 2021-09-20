package swing;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
 MyFrame()
 {
	 JFrame frame=new JFrame();//creates a frame
     this.setTitle("MY WINDOW");//sets title of this
     this.setSize(500,500);//sets thex-dimension and y-dimension of this
     this.setVisible(true);//make this visible
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
   ImageIcon img=new ImageIcon("java.jpeg");//creates image icon to the this
   this.setIconImage(img.getImage());//change icon of this
   this.getContentPane().setBackground(new Color(25,255,255));//change color of background
   this.setResizable(false);//prevent frame from being resized
 }
}

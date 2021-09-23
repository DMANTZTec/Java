package layouts;
import javax.swing.*;
import java.awt.*;

public class borderlayotdemo {
	public static void main(String[] args)
	{
		
		JPanel panel1=new JPanel(); // creatng panel1
		JPanel panel2=new JPanel();// creatng panel2
		JPanel panel3=new JPanel();// creatng panel3
		JPanel panel4=new JPanel();// creatng panel4
		JPanel panel5=new JPanel();// creatng panel5
		JPanel panel6=new JPanel();// creatng panel6
		JPanel panel7=new JPanel();// creatng panel7
		JPanel panel8=new JPanel();// creatng panel8
		JPanel panel9=new JPanel();// creatng panel9
		JPanel panel10=new JPanel();// creatng panel10

		
		panel1.setBackground(Color.red); //adding colour for panel1
		panel2.setBackground(Color.green);//adding colour for panel2
		panel3.setBackground(Color.blue);//adding colour for panel3
		panel4.setBackground(Color.black);//adding colour for panel4
		panel5.setBackground(Color.yellow);//adding colour for pane5
		
		panel6.setBackground(Color.gray);//adding colour for panel6
		panel7.setBackground(Color.black);//adding colour for panel7
		panel8.setBackground(Color.blue);//adding colour for panel8
		panel9.setBackground(Color.red);//adding colour for panel9
		panel10.setBackground(Color.white);//adding colour for panel10
		
		panel1.setPreferredSize(new Dimension(100,100)); //setting dimension size for panel1
		panel2.setPreferredSize(new Dimension(100,100));//setting dimension size for panel2
		panel3.setPreferredSize(new Dimension(100,100));//setting dimension size for panel3
		panel4.setPreferredSize(new Dimension(100,100));//setting dimension size for panel4
		panel5.setPreferredSize(new Dimension(100,100));//setting dimension size for panel5
		
		panel6.setPreferredSize(new Dimension(100,100));//setting dimension size for panel6
		panel7.setPreferredSize(new Dimension(100,100));//setting dimension size for panel7
		panel8.setPreferredSize(new Dimension(100,100));//setting dimension size for panel8
		panel9.setPreferredSize(new Dimension(100,100));//setting dimension size for panel0
		panel10.setPreferredSize(new Dimension(100,100));//setting dimension size for panel0
		
		
		JFrame frame= new JFrame(); //creating frame
		frame.setLayout(new BorderLayout(10,10)); //setting border layout
		frame.setVisible(true); //to appear window
		frame.setSize(500,500);
		frame.setTitle("border layout"); //setting title for window
		
		frame.add(panel1,BorderLayout.NORTH); //adding panel1 to the frame at the north side
		frame.add(panel2,BorderLayout.CENTER);//adding panel2 to the frame at the center side
		frame.add(panel3,BorderLayout.SOUTH);//adding panel3 to the frame at the south side
		frame.add(panel4,BorderLayout.EAST);//adding panel4 to the frame at the east side
		frame.add(panel5,BorderLayout.WEST);//adding panel5 to the frame at the west side
		
		panel2.add(panel6,BorderLayout.WEST); //adding panel6 to the panel2 at the west side
		panel2.add(panel7,BorderLayout.EAST);//adding panel7 to the panel2 at the north
		panel2.add(panel8,BorderLayout.SOUTH);//adding panel8 to the panel2 at the north
		panel2.add(panel9,BorderLayout.NORTH);//adding panel9 to the panel2 at the north
		panel2.add(panel10,BorderLayout.WEST);//adding panel10 to the panel2 at the north
		
	}

}

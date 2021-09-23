package swings1;
import javax.swing.*;
import java.awt.*;

public class panelsdemo {

	public static void main(String[] args) {
		ImageIcon image=new ImageIcon("thumbsup.jpg"); //adding image to the label
	JPanel redpanel=new JPanel(); //creating red panel
		redpanel.setBackground(Color.red); // adding red to the panel
		redpanel.setBounds(0,0,250,250); //setting x,y dimensions and size for the redpanel
		redpanel.setLayout(null);
		
		JPanel bluepanel=new JPanel(); //creating bluepanel
		bluepanel.setBackground(Color.blue);// adding red to the panel
		bluepanel.setBounds(250,0,250,250);//setting x,y dimensions and size for the redpanel
		bluepanel.setLayout(null);
		
		JPanel greenpanel=new JPanel(); //creating green panel
		greenpanel.setBackground(Color.green);// adding red to the panel
		greenpanel.setBounds(0,250,500,250);//setting x,y dimensions and size for the redpanel
		greenpanel.setLayout(null); 
		
		// TODO Auto-generated method stub
		JLabel label=new JLabel(); //creating label
		label.setIcon(image); //adding imag
		label.setText("helo"); //adding text

		JFrame frame =new JFrame(); //creating frame
		frame.setSize(1000,1000); //setting size for frame
		frame.setVisible(true); //to appear window
		frame.setLayout(null);
		
		frame.add(redpanel); //adding redpanel to the frame
		frame.add(bluepanel);//adding bluepanel to the frame
		frame.add(greenpanel);//adding greenpanel to the frame
		greenpanel.add(label); //adding label to the panel
		
		
	}

}

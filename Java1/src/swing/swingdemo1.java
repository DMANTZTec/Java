package swing;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


	public class swingdemo1 {

		public static void main(String[] args) {
			//JFrame is a GUI window to add components
			//create a frame
	        JFrame frame=new JFrame();
	        //set title
	        frame.setTitle("MY WINDOW");
	        //set the dimensions
	        frame.setSize(500,500);
	        frame.setVisible(true);
	        //exit out of the application
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        //creates image icon to the frame
	        ImageIcon img=new ImageIcon("alien.jpg");
	        //change icon of frame
	        frame.setIconImage(img.getImage());
	        //change color of background
	        frame.getContentPane().setBackground(new Color(255,255,255));
	      
		new JFrame();
		}

	}

//import java Awt class
import java.awt.*;
//class AwtEx1 class directly creates the instance of Frame class
public class AwtEx1  {
	//Initializing using constructor 
	AwtEx1()
	{
		//creating label
		Label label=new Label("Employee id");
		//creating Textfield
		TextField t=new TextField();
		//creating frame
		Frame frame=new Frame();
		//creating button
		Button b=new Button("submit");
		//setting visibility of frame
		frame.setVisible(true);
		//setting position of the above components in the frame
		b.setBounds(100,100,80,30);
		label.setBounds(20,80,80,30);
		t.setBounds(20,100,80,30);
		//adding components into frame
		frame.add(b);
		frame.add(label);
		frame.add(t);
		//frame size 400 width,300 height
		frame.setSize(400,300);
	//no layout
		frame.setLayout(null);
		//setting title of frame
		frame.setTitle("Employee info");
	
		
		
	}

	public static void main(String[] args) {
		// creating instance of Frame class
     AwtEx1 a=new AwtEx1();
	}

}

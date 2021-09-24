package awt;
import java.awt.*;
class awt1 extends Frame //class awt1 extends frame
{
	 awt1() //creating constructor
	 {
		 
		 Button button=new Button("click me"); //creating button
		 this.setVisible(true); //to appear on the window
		 this.setSize(400,400); //setting size for the window
		 this.add(button); //adding button to the frame
		 this.setLayout(null); //setting null layout
	 //this.setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
		 button.setBounds(150,150,80,30); //dimensions and sizes for the button
	 }
	
	
}
public class awtdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new awt1(); //calling constructor

	}

}

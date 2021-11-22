package Ammu;
import java.awt.*;
import java.awt.event.ActionListener;
public class FirstDemo extends Frame implements ActionListener{
	public FirstDemo() {
		setSize(300,400);
		setVisible(true);
		setLayout(null);
		
		Button b=new Button("Click here");
		b.setBounds(25,120,70,25);
		b.addActionListener((ActionListener) this);
		add(b);
		
	
		}
	@Override
	public void actionPerformed(java.awt.event.ActionEvent e) {
		// TODO Auto-generated method stub
		this.setBackground(Color.GRAY);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstDemo obj = new FirstDemo();
	}

}

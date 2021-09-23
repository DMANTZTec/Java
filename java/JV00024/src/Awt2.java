import java.awt.*;
import java.awt.event.*;
public class Awt2 extends Frame implements ActionListner{
	TextField tf;
	Awt2(){
		TextField tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click me");
		b.setBounds(100,120,80,30);
		b.addActionListner(this);
		add(b);
		add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
	}

	public void actionperformed(ActionEvent e)
	{
		tf.setText("welcome");
	}

	public static void main(String[] args)
 {
		// TODO Auto-generated method stub
		new Awt2();

	
    new Awt2();
}
}

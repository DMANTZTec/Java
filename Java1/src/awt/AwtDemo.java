package awt;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class AwtDemo extends Frame implements ActionListener{
	TextField tf;
	AwtDemo(){
		TextField tf=new TextField();
		tf.setBounds(60,50,170,20);
		Button b=new Button("Click me");
		b.setBounds(100,120,80,30);
		b.addActionListener(this);
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


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new AwtDemo();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}

package awt2;
import java.awt.*;  
import java.awt.event.*;


	  
public	class eventlistener extends Frame implements ActionListener{  
	TextField tf;  
	eventlistener(){  
	  
	//create components  
	tf=new TextField();  
	tf.setBounds(60,50,170,20);  
	Button b=new Button("click me");  
	b.setBounds(100,120,80,30);  
	  
	
	b.addActionListener(this);  
	  
	 
	add(b);add(tf);  
	setSize(300,300);  
	setLayout(null);  
	setVisible(true);  
	}  
	public void actionPerformed(ActionEvent e){  
	tf.setText("Welcome");  
	}  
	
	public static void main(String args[]){  
	new eventlistener();  
	}
	
	}

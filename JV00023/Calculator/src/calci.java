import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calci {

	private JFrame frame;
	private JTextField textField;
     double first;
     double second;
     double result;
     String operation;
     String answer;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calci window = new calci();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calci() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 270, 342);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 375, 370, 2);
		frame.getContentPane().add(scrollPane);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 18));
		textField.setBounds(20, 11, 220, 46);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnBackspace = new JButton("<-");
		btnBackspace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;
				if(textField.getText().length()>0)
				{
					StringBuilder str=new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnBackspace.setFont(new Font("windings", Font.BOLD, 14));
		btnBackspace.setBackground(Color.LIGHT_GRAY);
		btnBackspace.setBounds(20, 68, 54, 43);
		frame.getContentPane().add(btnBackspace);
		
		final JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number=textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBackground(Color.LIGHT_GRAY);
		btn1.setBounds(20, 110, 54, 46);
		frame.getContentPane().add(btn1);
		
		final JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBackground(Color.LIGHT_GRAY);
		btn4.setBounds(20, 154, 54, 43);
		frame.getContentPane().add(btn4);
		
		final JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnClear.setBackground(Color.LIGHT_GRAY);
		btnClear.setBounds(77, 68, 54, 43);
		frame.getContentPane().add(btnClear);
		
		final JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBackground(Color.LIGHT_GRAY);
		btn2.setBounds(77, 110, 54, 43);
		frame.getContentPane().add(btn2);
		
		JButton btnMod = new JButton("%");
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";
			}
		});
		btnMod.setBackground(Color.LIGHT_GRAY);
		btnMod.setBounds(134, 68, 54, 43);
		frame.getContentPane().add(btnMod);
		
		final JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBackground(Color.LIGHT_GRAY);
		btn3.setBounds(134, 110, 54, 46);
		frame.getContentPane().add(btn3);
		
		final JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();
				textField.setText(number);
			}
			
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBackground(Color.LIGHT_GRAY);
		btn5.setBounds(77, 154, 54, 43);
		frame.getContentPane().add(btn5);
		
		final JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBackground(Color.LIGHT_GRAY);
		btn6.setBounds(134, 154, 54, 43);
		frame.getContentPane().add(btn6);
		
		JButton btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnAdd.setBackground(Color.LIGHT_GRAY);
		btnAdd.setBounds(190, 68, 54, 43);
		frame.getContentPane().add(btnAdd);
		
		JButton btnsub = new JButton("-");
		btnsub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="-";
			}
		});
		btnsub.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnsub.setBackground(Color.LIGHT_GRAY);
		btnsub.setBounds(190, 113, 54, 40);
		frame.getContentPane().add(btnsub);
		
		JButton btnmul = new JButton("*");
		btnmul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";
			}
		});
		btnmul.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnmul.setBackground(Color.LIGHT_GRAY);
		btnmul.setBounds(190, 154, 54, 43);
		frame.getContentPane().add(btnmul);
		
		final JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();
				textField.setText(number);
			}
			});
		btn7.setBackground(Color.LIGHT_GRAY);
		btn7.setBounds(20, 197, 54, 43);
		frame.getContentPane().add(btn7);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBackground(Color.LIGHT_GRAY);
		btn8.setBounds(77, 197, 54, 43);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBackground(Color.LIGHT_GRAY);
		btn9.setBounds(134, 197, 54, 43);
		frame.getContentPane().add(btn9);
		
		JButton btn = new JButton("/");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";
			}
		});
		btn.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn.setBackground(Color.LIGHT_GRAY);
		btn.setBounds(190, 197, 54, 40);
		frame.getContentPane().add(btn);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(368, 154, -36, 2);
		frame.getContentPane().add(scrollPane_1);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(147, 275, 2, 2);
		frame.getContentPane().add(scrollPane_2);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(246, 109, 2, 2);
		frame.getContentPane().add(scrollPane_3);
		
		final JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 13));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBackground(Color.LIGHT_GRAY);
		btn0.setBounds(20, 240, 54, 46);
		frame.getContentPane().add(btn0);
		
		final JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnDot.setBackground(Color.LIGHT_GRAY);
		btnDot.setBounds(77, 240, 54, 46);
		frame.getContentPane().add(btnDot);
		
		final JButton btn00 = new JButton("00");
		btn00.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn00.getText();
				textField.setText(number);
			}
		});
		btn00.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn00.setBackground(Color.LIGHT_GRAY);
		btn00.setBounds(134, 240, 54, 46);
		frame.getContentPane().add(btn00);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String answer;
				second=Double.parseDouble(textField.getText());
				if(operation =="+")
				{
					result=first+second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				if(operation =="%")
				{
					result=first%second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				if(operation =="-")
				{
					result=first-second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				if(operation =="*")
				{
					result=first*second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
				if(operation =="/")
				{
					result=first/second;
					answer=String.format("%.2f",result);
					textField.setText(answer);
				}
					
				
			}
		});
		btnEqual.setBackground(Color.LIGHT_GRAY);
		btnEqual.setBounds(190, 239, 54, 47);
		frame.getContentPane().add(btnEqual);
	}
}

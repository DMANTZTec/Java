package Ammu;
import java.awt.*;
//import java.awt.event.*;
import java.applet.*;
/*<applet code=Labeldemo width = 600 height=500></applet>*/ 
public class Labeldemo extends Applet {
    public void init()
{
	setBackground(Color.black);
	setForeground(Color.yellow);
	Label l1= new Label("Branch");
	Label l2= new Label("college");
	add(l1);
	add(l2);
	
}
public void paint(Graphics g)
{
	g.drawString("LABELDEMO",50,50);
	
}


}

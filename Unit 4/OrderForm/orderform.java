import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class orderform extends Applet implements ActionListener
{
    public void init ()
    {
	resize (200, 150);
	JLabel title = new JLabel ("Order Form");
	title.setFont (new Font("Arial", Font.ITALIC, 30));
	title.setForeground (Color.red);
	JLabel fries = new JLabel ("Fries @ $1.50 each ");
	JTextField fries1 = new JTextField (3);
	JLabel burgers = new JLabel ("Burger @ $3.50 each ");
	JTextField burgers1 = new JTextField (3);
	JLabel sodas = new JLabel ("Sodas @ $1.00 each ");
	JTextField sodas1 = new JTextField (3);
	JButton b = new JButton ("Order Now!");
	add (title);
	add (fries);
	add (fries1);
	add (burgers);
	add (burgers1);
	add (sodas);
	add (sodas1);
	add (b);
    }


    public void actionPerformed (ActionEvent e)
    {
    }
}

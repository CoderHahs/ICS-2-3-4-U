import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class textfieldgames extends Applet implements ActionListener
{
    JTextField t1;
    JTextField t2;
    JTextField t3;
    public void init ()
    {
	resize (800, 670);
	JLabel thiefpic = new JLabel (createImageIcon ("paintThief.jpg"));
	JLabel q1 = new JLabel ("Thief's colour: ");
	t1 = new JTextField (5);
	JButton d1 = new JButton ("Done");
	d1.addActionListener (this);
	d1.setActionCommand ("d1");
	d1.setBackground (Color.gray);
	d1.setForeground (Color.yellow);

	Panel p1 = new Panel ();
	p1.add (thiefpic);
	p1.add (q1);
	p1.add (t1);
	p1.add (d1);
	add (p1);

	JLabel mealpic = new JLabel (createImageIcon ("mealOrder.jpg"));
	JLabel q2 = new JLabel ("Order (ABC): ");
	t2 = new JTextField (3);
	JButton d2 = new JButton ("Done");
	d2.addActionListener (this);
	d2.setActionCommand ("d2");
	d2.setBackground (Color.yellow);
	d2.setForeground (Color.blue);

	Panel p2 = new Panel ();
	p2.add (mealpic);
	p2.add (q2);
	p2.add (t2);
	p2.add (d2);
	add (p2);

	JLabel wildpic = new JLabel (createImageIcon ("wildwest.jpg"));
	JLabel q3 = new JLabel ("Missing Piece Letter: ");
	t3 = new JTextField (3);
	JButton d3 = new JButton ("Done");
	d3.addActionListener (this);
	d3.setActionCommand ("d3");
	d3.setBackground (Color.cyan);
	d3.setForeground (Color.black);

	Panel p3 = new Panel ();
	p3.add (wildpic);
	p3.add (q3);
	p3.add (t3);
	p3.add (d3);
	add (p3);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("d1"))
	{
	    String txt = t1.getText ();
	    if (txt.equalsIgnoreCase ("red"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
	else if (e.getActionCommand ().equals ("d2"))
	{
	    String txt = t2.getText ();
	    if (txt.equalsIgnoreCase ("bca"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}
	else
	{
	    String txt = t3.getText ();
	    if (txt.equalsIgnoreCase ("c"))
	    {
		JOptionPane.showMessageDialog (null, "You got it! Great work!", "Correct", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "You are incorrect, please try again.", "Incorrect", JOptionPane.ERROR_MESSAGE);
	    }
	}


    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = textfieldgames.class.getResource (path);
	if (imgURL != null)
	{
	    return new ImageIcon (imgURL);
	}
	else
	{
	    System.err.println ("Couldn't find file: " + path);
	    return null;
	}
    }
}

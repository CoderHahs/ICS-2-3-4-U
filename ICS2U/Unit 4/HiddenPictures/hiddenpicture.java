import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class hiddenpicture extends Applet implements ActionListener
{
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JButton next;
    JLabel o1;
    JLabel o2;
    JLabel o3;
    JLabel pic1;
    int n = 0;
    public void init ()
    {
	resize (670, 700);
	JLabel title = new JLabel ("            Hidden Pictures: Level 1              ");
	title.setFont (new Font ("Arial", Font.BOLD, 25));
	title.setForeground (Color.blue);
	JLabel i = new JLabel ("Find the picture and enter it's position (eg A1) in the text box.");
	i.setForeground (Color.red);
	JLabel i1 = new JLabel ("Press enter. If correct, you will movie to the next level.");
	i1.setForeground (Color.red);
	pic1 = new JLabel (createImageIcon ("picture.jpg"));
	JLabel find = new JLabel ("Find:              ");
	o1 = new JLabel ("Grandma on Bike:");
	t1 = new JTextField (3);
	o2 = new JLabel ("Diver:                      ");
	t2 = new JTextField (3);
	o3 = new JLabel ("Waldo (in balck and white): ");
	t3 = new JTextField (3);
	next = new JButton ("Enter");
	next.addActionListener (this);
	next.setActionCommand ("next");

	add (title);
	add (i);
	add (i1);
	add (pic1);
	add (find);
	add (o1);
	add (t1);
	add (o2);
	add (t2);
	add (o3);
	add (t3);
	add (next);


    }


    public void actionPerformed (ActionEvent e)
    {
	String ans1 = t1.getText ();
	String ans2 = t2.getText ();
	String ans3 = t3.getText ();

	if (e.getActionCommand ().equals ("next") && n != 1)
	{
	    if (ans1.equalsIgnoreCase ("d4") && ans2.equalsIgnoreCase ("a2") && ans3.equalsIgnoreCase ("a6"))
	    {
		next.setText ("Next");
		next.setActionCommand ("next2");
		n = 1;
		JOptionPane.showMessageDialog (null, "You got them all! Well Done. Move to Level 2", "You got it!", JOptionPane.INFORMATION_MESSAGE);
	    }
	    else
	    {
		n = 2;
		JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
	    }
	}

	else if (e.getActionCommand ().equals ("next2"))
	{
	    pic1.setIcon (createImageIcon ("picture2.jpg"));
	    o1.setText ("Domino: ");
	    t1.setText (null);
	    o2.setText ("Peacock Feather: ");
	    t2.setText (null);
	    o3.setText ("Mystical Orb: ");
	    t3.setText (null);
	    next.setText ("Enter");
	    next.setActionCommand ("next3");
	}
	else if (e.getActionCommand ().equals ("next3"))
	{
	    if (ans1.equalsIgnoreCase ("a3") && ans2.equalsIgnoreCase ("d1") && ans3.equalsIgnoreCase ("e2"))
	    {
		JOptionPane.showMessageDialog (null, "You got them all! Well Done.", "You got it!", JOptionPane.INFORMATION_MESSAGE);

	    }
	    else
	    {
		JOptionPane.showMessageDialog (null, "Some of the Positions were incorrect. Try again.", "You didn't get them all!", JOptionPane.ERROR_MESSAGE);
	    }
	}
    }



    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = hiddenpicture.class.getResource (path);
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

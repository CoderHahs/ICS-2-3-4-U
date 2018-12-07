import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class monstermash extends Applet implements ActionListener
{
    JButton feet;
    JButton mid;
    JButton head;
    int nf = 1;
    int nm = 1;
    int nh = 1;
    public void init ()
    {
	resize (500, 435);
	JLabel title = new JLabel ("Welcome to the Monster Mash");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setBackground (Color.black);
	JLabel inst = new JLabel ("Click on the head, middle, or feet to change it.");
	feet = new JButton (createImageIcon ("feet" + nf + ".jpg"));
	feet.addActionListener (this);
	feet.setActionCommand ("feet");
	mid = new JButton (createImageIcon ("mid" + nm + ".jpg"));
	mid.addActionListener (this);
	mid.setActionCommand ("mid");
	head = new JButton (createImageIcon ("head" + nh + ".jpg"));
	head.addActionListener (this);
	head.setActionCommand ("head");

	add (title);
	add (head);
	add (mid);
	add (feet);
	add (inst);

    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("feet"))
	{
	    if (nf == 5)
		nf = 1;
	    else
		nf++;
	}
	if (e.getActionCommand ().equals ("mid"))
	{
	    if (nm == 5)
		nm = 1;
	    else
		nm++;
	}
	if (e.getActionCommand ().equals ("head"))
	{
	    if (nh == 5)
		nh = 1;
	    else
		nh++;
	}
	feet.setIcon (createImageIcon ("feet" + nf + ".jpg"));
	mid.setIcon (createImageIcon ("mid" + nm + ".jpg"));
	head.setIcon (createImageIcon ("head" + nh + ".jpg"));
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = monstermash.class.getResource (path);
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

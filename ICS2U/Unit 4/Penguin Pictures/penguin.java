import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class penguin extends Applet implements ActionListener
{
    JLabel step;
    int n = 1;
    String story[] = new String [11];
    story [1] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [2] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [3] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [4] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [5] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [6] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [7] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [8] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [9] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [10] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    story [11] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.");
    public void init ()
    {
	resize (300, 300);
	JLabel title = new JLabel ("Little Red Riding Hood");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.red);
	step = new JLabel (createImageIcon ("red" + n + ".jpg"));
	JButton next = new JButton ("Next");
	next.setActionCommand ("next");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.red);
	JButton back = new JButton ("Back");
	back.setActionCommand ("back");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.red);

	add (title);
	add (step);
	add (back);
	add (next);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("next") && n < 7 && n > 0)
	    n++;
	else if (e.getActionCommand ().equals ("next") && n == 7)
	    n = 1;
	else if (e.getActionCommand ().equals ("back") && n == 1)
	    n = 7;
	else
	    n--;
	step.setIcon (createImageIcon ("red" + n + ".jpg"));


    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = penguin.class.getResource (path);
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

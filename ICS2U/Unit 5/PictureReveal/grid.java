import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class grid extends Applet implements ActionListener
{
    int row = 3;
    JButton a[] = new JButton [row * row];
    public void init ()
    {
	JLabel title = new JLabel ("Picture Reveal");
	title.setFont (new Font ("Arial", Font.PLAIN, 40));
	JLabel ins = new JLabel ("Click on the squares to reveal the images!");
	JButton reset = new JButton ("Reset");
	reset.addActionListener (this);
	reset.setActionCommand ("-1");

	Panel g = new Panel (new GridLayout (row, row));
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton (" ");
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setPreferredSize (new Dimension (216, 162));
	    a [i].setBackground (Color.gray);
	    g.add (a [i]);
	}
	add (title);
	add (g);
	add (ins);
	add (reset);
	resize (700, 600);
    }


    public void actionPerformed (ActionEvent e)
    {
	int n = Integer.parseInt (e.getActionCommand ());
	if (n == -1)
	{
	    for (int i = 0 ; i < a.length ; i++)
		a [i].setIcon (null);
	}
	else
	{

	    a [n].setIcon (createImageIcon ("dogs" + (n + 1) + ".jpg"));
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = grid.class.getResource (path);
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

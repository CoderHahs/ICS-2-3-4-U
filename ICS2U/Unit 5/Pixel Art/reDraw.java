import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class reDraw extends Applet implements ActionListener
{
    int row = 10;
    JButton a[] = new JButton [row * row];
    int alien[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 0, 0, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    int face[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 0, 1, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    int heart[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 1, 1, 0, 0, 0, 1, 1, 0, 0}, {0, 1, 1, 1, 0, 1, 1, 1, 0, 0}, {0, 1, 1, 1, 1, 1, 1, 1, 0, 0}, {0, 0, 1, 1, 1, 1, 1, 0, 0, 0}, {0, 0, 0, 1, 1, 1, 0, 0, 0, 0}, {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    int railway[] [] = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, {0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
    public void init ()
    {
	Panel g = new Panel (new GridLayout (row, row));
	JLabel title = new JLabel ("Pixel Art");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.red);

	JButton al = new JButton ("Alien");
	al.addActionListener (this);
	al.setActionCommand ("al");

	JButton f = new JButton ("Face");
	f.addActionListener (this);
	f.setActionCommand ("f");

	JButton h = new JButton ("Heart");
	h.addActionListener (this);
	h.setActionCommand ("h");

	JButton b = new JButton ("Railway");
	b.addActionListener (this);
	b.setActionCommand ("b");


	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton ("");
	    a [i].setBackground (Color.white);
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    a [i].setPreferredSize (new Dimension (20, 20));
	    g.add (a [i]);
	}
	add (title);
	add (g);
	add (al);
	add (f);
	add (h);
	add (b);
	resize (250, 325);
    }


    public void alien ()
    {
	int n = 0;
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		a [n].setBackground (Color.white);
		if (alien [i] [j] == 1)
		    a [n].setBackground (Color.red);
		n++;
	    }
	}
    }


    public void face ()
    {
	int n = 0;
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		a [n].setBackground (Color.white);
		if (face [i] [j] == 1)
		    a [n].setBackground (Color.red);
		n++;
	    }
	}
    }


    public void heart ()
    {
	int n = 0;
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		a [n].setBackground (Color.white);
		if (heart [i] [j] == 1)
		    a [n].setBackground (Color.red);
		n++;
	    }
	}
    }


    public void railway ()
    {
	int n = 0;
	for (int i = 0 ; i < 10 ; i++)
	{
	    for (int j = 0 ; j < 10 ; j++)
	    {
		a [n].setBackground (Color.white);
		if (railway [i] [j] == 1)
		    a [n].setBackground (Color.red);
		n++;
	    }
	}
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("al"))
	    alien ();
	else if (e.getActionCommand ().equals ("f"))
	    face ();
	else if (e.getActionCommand ().equals ("h"))
	    heart ();
	else
	    railway ();


    }
}



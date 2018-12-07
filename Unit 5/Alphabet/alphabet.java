import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class alphabet extends Applet implements ActionListener
{
    JTextField text;
    public void init ()
    {
	text = new JTextField (50);
	JButton a[] = new JButton [26];
	Panel g = new Panel (new GridLayout (2, 13));
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton ("" + (char) (i + 97));
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + (char) (i + 97));
	    g.add (a [i]);
	}

	JButton b[] = new JButton [10];
	JButton space = new JButton ("spacebar");
	space.setBackground (Color.red);
	space.addActionListener (this);
	space.setActionCommand (" ");
	add (text);
	for (int i = 0 ; i < b.length ; i++)
	{
	    b [i] = new JButton ("" + i);
	    b [i].addActionListener (this);
	    b [i].setActionCommand ("" + i);
	    b [i].setBackground (Color.white);
	    add (b [i]);
	}
	add (g);
	add (space);
	resize (600, 150);


    }


    public void actionPerformed (ActionEvent e)
    {
	text.setText (text.getText () + e.getActionCommand ());
    }
}

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class grid extends Applet implements ActionListener
{
    int row = 8;
    int pic[] [] = {{1, 3, 1, 3, 1, 3, 1, 3}, {3, 1, 3, 1, 3, 1, 3, 1}, {1, 3, 1, 3, 1, 3, 1, 3},
	    {2, 1, 2, 1, 2, 1, 2, 1}, {1, 2, 1, 2, 1, 2, 1, 2}, {4, 1, 4, 1, 4, 1, 4, 1}, {1, 4, 1, 4, 1, 4, 1, 4},
	    {4, 1, 4, 1, 4, 1, 4, 1}};
    JButton a[] = new JButton [row * row];
    int n2 = -1;
    int x2 = 0;
    int y2 = 0;

    public void init ()
    {
	Panel g = new Panel (new GridLayout (row, row));

	int z = 0;
	for (int i = 0 ; i < row ; i++)
	{
	    for (int j = 0 ; j < row ; j++)
	    {
		a [z] = new JButton (createImageIcon ("b" + pic [i] [j] + ".jpg"));

		a [z].addActionListener (this);
		a [z].setActionCommand ("" + z);
		a [z].setPreferredSize (new Dimension (40, 40));
		g.add (a [z]);
		z++;
	    }
	}

	add (g);
	resize (350, 350);
    }


    public void actionPerformed (ActionEvent e)
    {
	int n = Integer.parseInt (e.getActionCommand ());

	if (n2 == -1)
	{
	    n2 = n;
	    x2 = n / row;
	    y2 = n % row;
	}
	else
	{
	    int x = n / row;
	    int y = n % row;

	    int temp = pic [x] [y];
	    pic [x] [y] = pic [x2] [y2];
	    pic [x2] [y2] = temp;
	    a [n].setIcon (createImageIcon ("b" + pic [x] [y] + ".jpg"));
	    a [n2].setIcon (createImageIcon ("b" + pic [x2] [y2] + ".jpg"));
	    n2 = -1;
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



import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class swapGame extends Applet implements ActionListener
{
    int row = 4;
    JButton a[] = new JButton [row * row];
    int k = -1;
    int num[] = new int [row * row];
    int t = 0;
    JLabel c;
    int z = 0;
    public void init ()
    {
	Panel g = new Panel (new GridLayout (row, row));
	JLabel title = new JLabel ("Swapping Game");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.red);

	JButton ins = new JButton ("Instructions");
	ins.addActionListener (this);
	ins.setActionCommand ("i");

	JButton reset = new JButton ("Reset");
	reset.addActionListener (this);
	reset.setActionCommand ("r");

	c = new JLabel ("Tries: " + t);
	c.setPreferredSize (new Dimension (50, 25));

	for (int i = 0 ; i < num.length ; i++)
	{
	    num [i] = i + 1;
	}
	for (int i = 0 ; i < 50 ; i++)
	{
	    int x = (int) (Math.random () * 16);
	    int y = (int) (Math.random () * 16);
	    int temp = num [x];
	    num [x] = num [y];
	    num [y] = temp;
	}
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton ("" + num [i]);
	    a [i].setBackground (Color.gray);
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    g.add (a [i]);
	}
	add (title);
	add (ins);
	add (g);
	add (c);
	add (reset);
	resize (303, 250);
    }


    public void actionPerformed (ActionEvent e)
    {

	int n2 = Integer.parseInt (a [15].getText ());
	if (e.getActionCommand ().equals ("i"))
	{
	    JOptionPane.showMessageDialog (null, "The objective of this game is to put the numbers in ascending order. \nClick one of the boxes to select the number. \nThen switch the number with another number by clicking on another box.", "Instructions", JOptionPane.INFORMATION_MESSAGE);

	}
	else if (e.getActionCommand ().equals ("r"))
	{
	    for (int i = 0 ; i < 50 ; i++)
	    {
		int k = (int) (Math.random () * 16);
		int n1 = (int) (Math.random () * 16);
		a [k].setText ("" + num [n1]);
		a [n1].setText ("" + num [k]);
		int temp = num [n1];
		num [n1] = num [k];
		num [k] = temp;
	    }
	    t = 0;
	}
	else
	{
	    int n = Integer.parseInt (e.getActionCommand ());

	    //int x = n / row;
	    //int y = n % row;
	    if (k == -1)
	    {
		k = n;
		a [n].setEnabled (false);
		a [n].setBackground (Color.red);
	    }
	    else
	    {
		a [k].setText ("" + num [n]);
		a [n].setText ("" + num [k]);
		a [k].setEnabled (true);
		a [n].setEnabled (true);
		a [n].setBackground (Color.gray);
		a [k].setBackground (Color.gray);
		int temp = num [n];
		num [n] = num [k];
		num [k] = temp;
		k = -1;
		t++;

	    }
	    z = 0;
	    for (int i = 0 ; i < (num.length - 1) ; i++)
	    {
		if (num [i] < num [i + 1])
		    z++;
	    }
	    if (z >= 15)
		JOptionPane.showMessageDialog (null, "You Win! Congratulations. Reset to start a new game now.", "Victory", JOptionPane.INFORMATION_MESSAGE);
	    c.setText ("Tries: " + t);
	}
    }
}



import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class kurplunk extends Applet implements ActionListener
{
    int row = 5;
    JButton a[] = new JButton [row * row];
    int t = 0;
    int c = 0;
    JLabel status;
    char hide[] [] = {{'s', 'n', 's', 's', 's'}, {'s', 'n', 'n', 's', 's'}, {'s', 'n', 's', 's', 'n'}, {'n', 'n', 's', 'n', 's'}, {'n', 's', 's', 'n', 's'}};
    public void init ()
    {
	JLabel title = new JLabel ("Welcome to Kurplunk!");
	JButton ins = new JButton ("Instructions");
	ins.setPreferredSize (new Dimension (125, 25));
	ins.addActionListener (this);
	ins.setActionCommand ("i");
	status = new JLabel ("                 Tries: " + t + "  Correct: " + c + "  ");
	status.setPreferredSize (new Dimension (200, 25));
	JButton r = new JButton ("New Game");
	r.addActionListener (this);
	r.setActionCommand ("r");
	Panel g = new Panel (new GridLayout (row, row));
	for (int i = 0 ; i < a.length ; i++)
	{
	    a [i] = new JButton (" ");
	    a [i].setBackground (Color.gray);
	    a [i].addActionListener (this);
	    a [i].setActionCommand ("" + i);
	    g.add (a [i]);
	}
	add (title);
	add (ins);
	add (g);
	add (status);
	add (r);
	resize (200, 300);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("i"))
	{
	    JOptionPane.showMessageDialog (null, "The objective of this game is to find soldiers that are hiding. \nClick one of the boxes to see if the soldier is in that position. \nIf the soldier is in that position then the box will turn red, and if not then it will turn blue. \nTo win, you must find all 15 soldiers.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
	}
	else if (e.getActionCommand ().equals ("r"))
	{
	    for (int i = 0 ; i < a.length ; i++)
	    {
		a [i].setEnabled (true);
		a [i].setBackground (Color.gray);
	    }
	    t = 0;
	    c = 0;
	    for (int x = 0 ; x < a.length ; x++)
	    {
		for (int y = 0 ; y < a.length ; y++)
		{
		    int c = (int) (Math.random () * 5);
		    int b = (int) (Math.random () * 5);

		    char temp = hide [c] [b];
		    hide [c] [b] = hide [b] [c];
		    hide [b] [c] = temp;
		}
	    }

	    status.setText ("                 Tries: " + t + "  Correct: " + c);
	}
	else
	{
	    int n = Integer.parseInt (e.getActionCommand ());
	    if (hide [n / 5] [n % 5] == 's')
	    {
		a [n].setBackground (Color.red);
		a [n].setEnabled (false);
		t++;
		c++;
	    }
	    else
	    {
		a [n].setBackground (Color.blue);
		a [n].setEnabled (false);
		t++;
	    }
	    status.setText ("                 Tries: " + t + "  Correct: " + c);
	    if (c == 15)
	    {
		JOptionPane.showMessageDialog (null, "You Win! Congratulations. Start a New Game now.", "Victory", JOptionPane.INFORMATION_MESSAGE);
		for (int i = 0 ; i < a.length ; i++)
		{
		    a [i].setEnabled (false);
		}
	    }
	}

    }
}


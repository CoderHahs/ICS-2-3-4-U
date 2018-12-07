import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class WhereIsIt extends Applet implements ActionListener
{
    int t = 0;
    int c = 0;
    JLabel status;
    JButton[] a;
    int row = 10;
    int col = 10;
    int total = row * col;
    int hiddenX = (int) ((Math.random () * 9) + 1);
    int hiddenY = (int) ((Math.random () * 9) + 1);
    public void init ()
    {
	JLabel title = new JLabel ("Hot and Cold");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	JButton ins = new JButton ("Instructions");
	ins.setPreferredSize (new Dimension (125, 25));
	ins.addActionListener (this);
	ins.setActionCommand ("i");
	Panel p = new Panel (new GridLayout (row, col, 0, 0));
	resize (410, 400);
	status = new JLabel ("                 Tries: " + t);
	status.setPreferredSize (new Dimension (200, 25));
	JButton r = new JButton ("Reset");
	r.addActionListener (this);
	r.setActionCommand ("r");
	a = new JButton [total];
	for (int nNum = 0 ; nNum < total ; nNum++)
	{
	    a [nNum] = new JButton (" ");
	    p.add (a [nNum]);
	    a [nNum].addActionListener (this);
	    a [nNum].setBackground (Color.gray);
	    a [nNum].setActionCommand ("" + nNum);
	}
	add (title);
	add (ins);
	add (p);
	add (status);
	add (r);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("i"))
	{
	    JOptionPane.showMessageDialog (null, "Rules: \nHidden in a randomly selected square is a red or \" hot \" square. The child's goal is to find it. \nIf the child selects a cell that is touching the \" hot \" square, the square turns orange. \nIf the child selects a cell that is in the row or column of the \" hot \" square, the square turns cyan. \nThe game keeps track of the number of turns that the child has taken. It also resets to another randomly selected hot square.", "Instructions", JOptionPane.INFORMATION_MESSAGE);
	}
	else if (e.getActionCommand ().equals ("r"))
	{
	    for (int i = 0 ; i < total ; i++)
	    {
		a [i].setEnabled (true);
		a [i].setBackground (Color.gray);
	    }
	    t = 0;

	    hiddenX = (int) ((Math.random () * 9) + 1);
	    hiddenY = (int) ((Math.random () * 9) + 1);


	    status.setText ("                 Tries: " + t);
	}
	else
	{
	    int pos = Integer.parseInt (e.getActionCommand ());
	    //find i and j
	    int i = pos / row;
	    int j = pos % row;
	    if (i == hiddenX && j == hiddenY)
	    {
		for (int ji = 0 ; ji < total ; ji++)
		{
		    a [ji].setEnabled (false);
		}
		a [pos].setBackground (Color.red);
		showStatus ("You win!");
		t++;
		a [pos].setEnabled (false);
	    }
	    else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j + 1 == hiddenY)
	    {
		a [pos].setBackground (Color.orange);
		t++;
		a [pos].setEnabled (false);
	    }
	    else if ((i + 1 == hiddenX || i - 1 == hiddenX) && j == hiddenY)
	    {
		a [pos].setBackground (Color.orange);
		t++;
		a [pos].setEnabled (false);
	    }
	    else if ((i + 1 == hiddenX || i == hiddenX || i - 1 == hiddenX) && j - 1 == hiddenY)
	    {
		a [pos].setBackground (Color.orange);
		t++;
		a [pos].setEnabled (false);
	    }
	    else if (i == hiddenX || j == hiddenY)
	    {
		a [pos].setBackground (Color.cyan);
		t++;
		a [pos].setEnabled (false);
	    }
	    else
	    {
		a [pos].setBackground (Color.blue);
		t++;
		a [pos].setEnabled (false);
	    }
	    status.setText ("                 Tries: " + t);
	}
    }
}

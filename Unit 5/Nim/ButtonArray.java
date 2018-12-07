import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
public class ButtonArray extends Applet implements ActionListener
{
    JButton[] a;
    int row = 8;
    JLabel c;
    String p1, p2;
    int n = 1;
    public void init ()
    { //a grid to layout the screen nicely
	Panel p = new Panel ();
	resize (500, 100);
	p1 = JOptionPane.showInputDialog ("Player 1: \nPlease enter your name: ");
	p2 = JOptionPane.showInputDialog ("Player 2: \nPlease enter your name: ");
	JLabel title = new JLabel ("     -----The Game of NIM-----");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setPreferredSize (new Dimension (500, 25));
	c = new JLabel ("It is " + p1 + "'s turn.");
	c.setFont (new Font ("Arial", Font.PLAIN, 15));
	c.setPreferredSize (new Dimension (125, 15));

	JButton ng = new JButton ("New Game");
	ng.addActionListener (this);
	ng.setActionCommand ("ng");

	//declare a new array of buttons
	a = new JButton [row];
	//initialize each of the buttons in the array
	//with an empty label
	for (int nNum = 0 ; nNum < row ; nNum++)
	{
	    a [nNum] = new JButton ("8");
	    p.add (a [nNum]);
	    //each button will have an action listener
	    a [nNum].addActionListener (this);
	    a [nNum].setBackground (Color.green);
	    //each button will send a message with its number
	    a [nNum].setActionCommand ("" + nNum);
	}
	add (title);
	add (c);
	add (p);
	add (ng);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("ng"))
	{
	    for (int j = 0 ; j < row ; j++)
	    {
		a [j].setLabel ("8");
		a [j].setBackground (Color.green);
		c.setText ("It is " + p1 + "'s turn.");
		a [j].setEnabled (true);
	    }
	}
	else
	{
	    int pos = Integer.parseInt (e.getActionCommand ());
	    int count = Integer.parseInt (a [pos].getText ());
	    String r = JOptionPane.showInputDialog ("There are " + count + " stones. Remove how many? ");
	    int r1 = Integer.parseInt (r);
	    while (r1 > count)
	    {
		r = JOptionPane.showInputDialog ("You cannot remove a greater amount of stones than in the pile. \nThere are " + count + " stones. Remove how many? ");
		r1 = Integer.parseInt (r);
	    }
	    count -= r1;
	    a [pos].setLabel (count + "");
	    if (count == 8)
		a [pos].setBackground (Color.green);
	    else if (count > 6)
		a [pos].setBackground (Color.yellow);
	    else if (count > 3)
		a [pos].setBackground (Color.orange);
	    else if (count >= 1)
		a [pos].setBackground (Color.red);
	    else
	    {
		a [pos].setEnabled (false);
		a [pos].setBackground (Color.white);
	    }
	    if (n == 1)
	    {
		c.setText ("It is " + p2 + "'s turn.");
		n = 2;
	    }
	    else
	    {
		c.setText ("It is " + p1 + "'s turn.");
		n = 1;
	    }

	    int x = 5;
	    for (int i = 0 ; i < row ; i++)
	    {
		x = Integer.parseInt (a [i].getText ());
	    }

	    if (x == 0)
	    {
		if (n == 1)
		    c.setText (p1 + " Wins!");
		else
		    c.setText (p2 + " Wins!");
	    }
	}
    }
}



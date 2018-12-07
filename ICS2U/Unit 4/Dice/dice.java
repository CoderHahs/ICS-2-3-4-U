import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class dice extends Applet implements ActionListener
{
    JLabel status;
    int n;
    JLabel dice;
    public void init ()
    {
	resize (400, 230);
	JLabel title = new JLabel ("Click to Roll the Dice");
	title.setFont (new Font("Arial", Font.PLAIN, 40));
	title.setForeground (Color.red);
	dice = new JLabel (createImageIcon ("dice5.jpg"));
	JButton roll = new JButton ("ROLL");
	roll.setActionCommand ("pressed");
	roll.addActionListener (this);
	status = new JLabel ("");
	status.setFont (new Font ("Arial", Font.PLAIN, 15));

	add (title);
	add (dice);
	add (roll);
	add (status);
    }


    public void actionPerformed (ActionEvent e)
    {
	n = (int) ((Math.random () * 6) + 1);
	if (e.getActionCommand ().equals ("pressed") && n == 1)
	    dice.setIcon (createImageIcon ("dice1.jpg"));
	else if (e.getActionCommand ().equals ("pressed") && n == 2)
	    dice.setIcon (createImageIcon ("dice2.jpg"));
	else if (e.getActionCommand ().equals ("pressed") && n == 3)
	    dice.setIcon (createImageIcon ("dice3.jpg"));
	else if (e.getActionCommand ().equals ("pressed") && n == 4)
	    dice.setIcon (createImageIcon ("dice4.jpg"));
	else if (e.getActionCommand ().equals ("pressed") && n == 5)
	    dice.setIcon (createImageIcon ("dice5.jpg"));
	else if (e.getActionCommand ().equals ("pressed") && n == 6)
	    dice.setIcon (createImageIcon ("dice6.jpg"));



	status.setText ("You rolled a " + n + ".");
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = dice.class.getResource (path);
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



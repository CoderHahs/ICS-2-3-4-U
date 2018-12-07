import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class guessinggame extends Applet implements ActionListener
{

    int nguess = 0;
    JTextField ans;
    JLabel clue;
    JLabel numofg;
    int n = (int) (Math.random () * 100 + 1);
    public void init ()
    {
	resize (300, 500);
	JLabel title = new JLabel ("The Guessing Game");
	title.setFont (new Font ("Jokerman", Font.BOLD, 24));
	title.setForeground (Color.red);

	JLabel i = new JLabel ("           The number is between 1 and 100             ");
	JLabel guess = new JLabel ("Your guess: ");
	ans = new JTextField (3);
	JButton bguess = new JButton ("Guess!");
	bguess.addActionListener (this);
	bguess.setActionCommand ("ans");
	JLabel pic = new JLabel (createImageIcon ("guess.jpeg"));
	clue = new JLabel ("Type in a number and press 'Guess!'");
	numofg = new JLabel ("You have taken " + nguess + " guesses so far.");
	JButton newgame = new JButton ("New Game");
	newgame.addActionListener (this);
	newgame.setActionCommand ("newgame");

	add (title);
	add (i);
	add (guess);
	add (ans);
	add (bguess);
	add (pic);
	add (clue);
	add (numofg);
	add (newgame);
    }


    public void actionPerformed (ActionEvent e)
    {

	int a = Integer.parseInt (ans.getText ());
	if (e.getActionCommand ().equals ("ans") && a < n)
	{
	    clue.setText ("Higher");
	    nguess++;
	}
	else if (e.getActionCommand ().equals ("ans") && a > n)
	{
	    clue.setText ("Lower");
	    nguess++;
	}
	else if (e.getActionCommand ().equals ("ans") && a == n)
	{
	    clue.setText ("You got it!");
	}
	else if (e.getActionCommand ().equals ("newgame"))
	{
	    n = (int) (Math.random () * 100 + 1);
	    nguess = 0;
	    clue.setText ("Type in a number and press 'Guess!'");
	}
	numofg.setText ("You have taken " + nguess + " guesses so far.");


    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = guessinggame.class.getResource (path);
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

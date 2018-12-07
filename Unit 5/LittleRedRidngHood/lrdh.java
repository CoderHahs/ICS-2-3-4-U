import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class lrdh extends Applet implements ActionListener
{
    JLabel step;
    int n = 1;
    JLabel word;
    String story[] = new String [11];



    public void init ()
    {
	story [0] = "Once upon a time, Little Red Riding Hood went to visit her sick grandmother.";
	story [1] = "She walked through the woods and over bridges.";
	story [2] = "After a while, she met a wolf who tricked her into picking flowers for her grandmother..";
	story [3] = "The wolf ran ahead and ate her sick grandmother, then he disguised himself.";
	story [4] = "When Red arrived, she was puzzled. She said, \"Grandmother, what big ears you have!\".";
	story [5] = "Then, Red said, \"Grandmother, what sharp teeth you have!\" and the wolf ate her.";
	story [6] = "Full, the wolf went to sleep and snore loudly. A nearby woodcutter heard him.";
	story [7] = "When the woodcutter came to investigate, he noticed a scarf coming out of the worlf's mouth.";
	story [8] = "The scarf was from the grandmother's knitting in the wolf's stomach.";
	story [9] = "The woodcutter pulled Little Red Riding Hood and her grandmother free!";
	story [10] = "The wolf was put in prison and everyone else lived happily ever after. The End.";

	resize (500, 300);
	JLabel title = new JLabel ("Little Red Riding Hood");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.red);
	step = new JLabel (createImageIcon ("red" + n + ".jpg"));
	word = new JLabel (story [(n - 1)]);
	JButton next = new JButton ("Next");
	next.setActionCommand ("next");
	next.addActionListener (this);
	next.setForeground (Color.white);
	next.setBackground (Color.red);
	JButton back = new JButton ("Back");
	back.setActionCommand ("back");
	back.addActionListener (this);
	back.setForeground (Color.white);
	back.setBackground (Color.red);

	add (title);
	add (step);
	add (word);
	add (back);
	add (next);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("next") && n < 11 && n > -1)
	    n++;
	else if (e.getActionCommand ().equals ("next") && n == 11)
	    n = 1;
	else if (e.getActionCommand ().equals ("back") && n == 1)
	    n = 11;
	else
	    n--;
	step.setIcon (createImageIcon ("red" + n + ".jpg"));
	word.setText (story [(n - 1)]);



    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = lrdh.class.getResource (path);
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

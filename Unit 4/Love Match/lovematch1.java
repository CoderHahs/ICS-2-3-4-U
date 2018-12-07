import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class lovematch1 extends Applet implements ActionListener
{
    Panel p_card;
    Panel card1, card2, card3;
    CardLayout cdLayout = new CardLayout ();
    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	title ();
	input ();
	output ();
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void actionPerformed (ActionEvent e)
    {


    }


    public void title ()
    {
	card1 = new Panel ();
	JLabel titlepic = new JLabel (createImageIcon ("title.jpg"));
	p_card.add ("1", card1);
    }


    public void input ()
    {
	card2 = new Panel ();
	card2.setBackground (Color.pink);
	JLabel title = new JLabel ("Love Meter");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.yellow);
	p_card.add ("2", card2);
    }


    public void output ()
    {
	card3 = new Panel ();
	p_card.add ("3", card3);
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = lovematch1.class.getResource (path);
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

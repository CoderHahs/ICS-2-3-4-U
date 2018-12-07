import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class hideandseek extends Applet implements ActionListener
{
    Panel p_card;  //to hold all of the screens
    Panel card0, card1, card2, card3, card4, card5; //the two screens
    CardLayout cdLayout = new CardLayout ();
    int x = (int) (Math.random () * 5 + 1);

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	main ();
	orange ();
	blue ();
	green ();
	purple ();
	baige ();
	resize (700, 500);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void main ()
    { //screen 1 is set up.
	card0 = new Panel ();
	card0.setBackground (Color.white);
	JLabel title = new JLabel ("                             Find Me!                           ");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	JLabel pic = new JLabel (createImageIcon ("bk.jpg"));
	JLabel i = new JLabel ("                     Look throughout the 99th Floor of the Burj Khalifa to find me.");
	Panel b = new Panel ();
	b.resize (150, 125);
	JButton b1 = new JButton ("Orange Room");
	b1.setPreferredSize (new Dimension (125, 25));
	b1.setActionCommand ("2");
	b1.addActionListener (this);
	JButton b2 = new JButton ("Blue Room");
	b2.setPreferredSize (new Dimension (125, 25));
	b2.setActionCommand ("3");
	b2.addActionListener (this);
	JButton b3 = new JButton ("Green Room");
	b3.setPreferredSize (new Dimension (125, 25));
	b3.setActionCommand ("4");
	b3.addActionListener (this);
	JButton b4 = new JButton ("Purple Room");
	b4.setPreferredSize (new Dimension (125, 25));
	b4.setActionCommand ("5");
	b4.addActionListener (this);
	JButton b5 = new JButton ("Beige Room");
	b5.setPreferredSize (new Dimension (125, 25));
	b5.setActionCommand ("6");
	b5.addActionListener (this);
	card0.add (title);
	card0.add (pic);
	card0.add (i);
	b.add (b1);
	b.add (b2);
	b.add (b3);
	b.add (b4);
	b.add (b5);
	card0.add (b);
	p_card.add ("0", card0);
    }


    JLabel here1;
    JLabel here2;
    JLabel here3;
    JLabel here4;
    JLabel here5;

    public void orange ()
    { //screen 1 is set up.
	card1 = new Panel ();
	card1.setBackground (Color.white);
	JLabel title = new JLabel ("Orange Room");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.orange);
	JLabel orange = new JLabel (createImageIcon ("orange.jpg"));
	here1 = new JLabel ("Not here                                                        ");
	JButton back = new JButton ("Back");
	back.setActionCommand ("1.1");
	back.addActionListener (this);
	card1.add (title);
	card1.add (orange);
	card1.add (here1);
	card1.add (back);
	p_card.add ("1", card1);
    }


    public void blue ()
    { //screen 2 is set up.
	card2 = new Panel ();
	card2.setBackground (Color.white);
	JLabel title = new JLabel ("Blue Room");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.blue);
	JLabel orange = new JLabel (createImageIcon ("blue.jpg"));
	JButton back = new JButton ("Back");
	back.setActionCommand ("1.1");
	back.addActionListener (this);
	card2.add (title);
	here2 = new JLabel ("Not here                                                             ");
	card2.add (orange);
	card2.add (here2);
	card2.add (back);
	p_card.add ("2", card2);
    }


    public void green ()
    { //screen 3 is set up.
	card3 = new Panel ();
	card3.setBackground (Color.white);
	JLabel title = new JLabel ("Green Room");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.green);
	JLabel orange = new JLabel (createImageIcon ("green.jpg"));
	JButton back = new JButton ("Back");
	back.setActionCommand ("1.1");
	back.addActionListener (this);
	card3.add (title);
	here3 = new JLabel ("Not here                                                               ");
	card3.add (orange);
	card3.add (here3);
	card3.add (back);
	p_card.add ("3", card3);
    }


    public void purple ()
    { //screen 4 is set up.
	card4 = new Panel ();
	card4.setBackground (Color.white);
	JLabel title = new JLabel ("Purple Room");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.magenta);
	JLabel orange = new JLabel (createImageIcon ("purple.jpg"));
	JButton back = new JButton ("Back");
	back.setActionCommand ("1.1");
	back.addActionListener (this);
	card4.add (title);
	here4 = new JLabel ("Not here                                                         ");
	card4.add (orange);
	card4.add (here4);
	card4.add (back);
	p_card.add ("4", card4);
    }


    public void baige ()
    { //screen 5 is set up.
	card5 = new Panel ();
	card5.setBackground (Color.white);
	JLabel title = new JLabel ("Beige Room");
	title.setFont (new Font ("Arial", Font.BOLD, 35));
	title.setForeground (Color.gray);
	JLabel orange = new JLabel (createImageIcon ("baige.jpg"));
	JButton back = new JButton ("Back");
	back.setActionCommand ("1.1");
	back.addActionListener (this);
	card5.add (title);
	here5 = new JLabel ("Not here                                                          ");
	card5.add (orange);
	card5.add (here5);
	card5.add (back);
	p_card.add ("5", card5);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens
	if (e.getActionCommand ().equals ("2"))
	{
	    cdLayout.show (p_card, "1");
	    if (x == 1)
	    {
		here1.setText ("You found me! Try and find me again.");
		x = (int) (Math.random () * 5 + 1);
	    }
	    else
		here1.setText ("I'm not here. Try again.");
	}
	else if (e.getActionCommand ().equals ("3"))
	{
	    cdLayout.show (p_card, "2");
	    if (x == 2)
	    {
		here2.setText ("You found me! Try and find me again.");
		x = (int) (Math.random () * 5 + 1);
	    }
	    else
		here2.setText ("I'm not here. Try again.");
	}
	else if (e.getActionCommand ().equals ("4"))
	{
	    cdLayout.show (p_card, "3");
	    if (x == 3)
	    {
		here3.setText ("You found me! Try and find me again.");
		x = (int) (Math.random () * 5 + 1);
	    }
	    else
		here3.setText ("I'm not here. Try again.");
	}
	else if (e.getActionCommand ().equals ("5"))
	{
	    cdLayout.show (p_card, "4");
	    if (x == 4)
	    {
		here4.setText ("You found me! Try and find me again.");
		x = (int) (Math.random () * 5 + 1);
	    }
	    else
		here4.setText ("I'm not here. Try again.");
	}
	else if (e.getActionCommand ().equals ("6"))
	{
	    cdLayout.show (p_card, "5");
	    if (x == 5)
	    {
		here5.setText ("You found me! Try and find me again.");
		x = (int) (Math.random () * 5 + 1);
	    }
	    else
		here5.setText ("I'm not here. Try again.");
	}
	else if (e.getActionCommand ().equals ("1.1"))
	{
	    cdLayout.show (p_card, "0");
	}

    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = hideandseek.class.getResource (path);
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

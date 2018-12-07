import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class lovematch extends Applet implements ActionListener
{
    Panel p_card;  //to hold all of the screens
    Panel card1, card2, card3, card4, card5; //the two screens
    CardLayout cdLayout = new CardLayout ();

    public void init ()
    {
	p_card = new Panel ();
	p_card.setLayout (cdLayout);
	title ();
	input ();
	output ();
	resize (300, 210);
	setLayout (new BorderLayout ());
	add ("Center", p_card);
    }


    public void title ()
    { //screen 1 is set up.
	card1 = new Panel ();
	card1.setBackground (Color.black);
	JButton next = new JButton (createImageIcon ("title.jpg"));
	next.setActionCommand ("2");
	next.addActionListener (this);
	card1.add (next);
	p_card.add ("1", card1);
    }


    JTextField ft;
    JTextField dft;
    JTextField mt;
    JTextField dmt;

    public void input ()
    { //screen 2 is set up.
	card2 = new Panel ();
	resize (400, 600);
	card2.setBackground (Color.pink);
	JLabel title = new JLabel ("Love Meter");
	title.setFont (new Font ("Arial", Font.BOLD, 50));
	title.setForeground (Color.yellow);
	JLabel i = new JLabel ("Enter her and his names and dates of birth");
	JLabel f = new JLabel ("Female name & date:   ");
	ft = new JTextField (5);
	dft = new JTextField (5);
	JLabel m = new JLabel ("Male name & date:    ");
	mt = new JTextField (5);
	dmt = new JTextField (5);

	JButton next = new JButton ("Calculate");
	next.setActionCommand ("3");
	next.addActionListener (this);
	card2.add (title);
	card2.add (i);
	card2.add (f);
	card2.add (ft);
	card2.add (dft);
	card2.add (m);
	card2.add (mt);
	card2.add (dmt);
	card2.add (next);
	p_card.add ("2", card2);
    }


    int i = (int) ((Math.random () * 100) + 1);
    JLabel title;
    JLabel e2;
    String e1 = "";

    public void output ()
    { //screen 3 is set up.
	card3 = new Panel ();
	card3.setBackground (Color.pink);
	if (i < 40)
	    e1 = ("Better luck next time.");
	else if (i < 60)
	    e1 = ("Congrats! Buy him/her flowers!");
	else
	    e1 = ("Never better!");

	title = new JLabel ("                                          We calculate...." + i + "                                          ");
	title.setFont (new Font ("Arial", Font.BOLD, 30));
	e2 = new JLabel ("                                          " + e1 + "                                         ");
	JButton next = new JButton ("Reset");
	next.setActionCommand ("4");
	next.addActionListener (this);
	card3.add (title);
	card3.add (e2);
	card3.add (next);
	p_card.add ("3", card3);
    }


    public void actionPerformed (ActionEvent e)
    { //moves between the screens
	if (e.getActionCommand ().equals ("1"))
	    cdLayout.show (p_card, "1");
	else if (e.getActionCommand ().equals ("2"))
	    cdLayout.show (p_card, "2");
	else if (e.getActionCommand ().equals ("3"))
	{
	    i = (int) ((Math.random () * 100) + 1);
	    title.setText ("                                          We calculate...." + i + "                                          ");
	    String e1 = "";
	    if (i < 40)
		e1 = ("Better luck next time.");
	    else if (i < 60)
		e1 = ("Congrats! Buy him/her flowers!");
	    else
		e1 = ("Never better!");
	    e2.setText ("                                          " + e1 + "                                         ");
	    cdLayout.show (p_card, "3");
	}
	else if (e.getActionCommand ().equals ("4"))
	{
	    ft.setText (null);
	    dft.setText (null);
	    mt.setText (null);
	    dmt.setText (null);
	    cdLayout.show (p_card, "2");
	}
    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = lovematch.class.getResource (path);
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

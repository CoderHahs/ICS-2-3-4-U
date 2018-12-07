import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class U2A2dog extends Applet implements ActionListener
{

    JTextField name, age;
    JLabel tagline;
    public void init ()
    {
	resize (300, 550);

	//JLabel title = new JLabel ("Happy Birthday");
	//title.setFont (new Font ("Jokerman", Font.BOLD, 24));
	//title.setForeground (Color.red);
	JLabel pic = new JLabel (createImageIcon ("hbdd.gif"));
	Panel pname = new Panel ();
	Panel pdate = new Panel ();
	JLabel ename = new JLabel ("\n\n Enter your Dog's Name:          ");
	name = new JTextField (10);
	JLabel eage = new JLabel ("\n Enter your Dog's Age:             ");
	age = new JTextField (10);
	JButton enter = new JButton ("Enter");
	enter.addActionListener (this);
	enter.setActionCommand ("enter");
	tagline = new JLabel ("\n\n                                                                                         ");
	tagline.setFont (new Font ("Jokerman", Font.BOLD, 12));
	tagline.setForeground (Color.red);

	//add (title);
	add (pic);
	pname.add (ename);
	pname.add (name);
	pdate.add (eage);
	pdate.add (age);
	add (pname);
	add (pdate);
	add (enter);
	add (tagline);

    }


    public void actionPerformed (ActionEvent e)
    {

	int a = Integer.parseInt (age.getText ());
	String getname = name.getText ();
	int humanage = a * 7;

	if (e.getActionCommand ().equals ("enter"))
	{
	    tagline.setText (getname + " is " + humanage + " years old in human years");
	}


    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = U2A2dog.class.getResource (path);
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

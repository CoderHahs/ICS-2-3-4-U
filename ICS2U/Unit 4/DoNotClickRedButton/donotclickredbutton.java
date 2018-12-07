import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class donotclickredbutton extends Applet implements ActionListener
{
    String i = ("Do not press the red button.");
    JLabel inst;
    int num = 1;
    public void init ()
    {
	resize (500, 375);
	String i = ("Do not press the red button.");
	JButton button = new JButton (createImageIcon ("redbutton.jpg"));
	button.setActionCommand ("pressed");
	button.addActionListener (this);
	inst = new JLabel ("                                       " + i + "                                       ");
	inst.setFont (new Font ("Arial", Font.PLAIN, 15));

	add (button);
	add (inst);
    }


    public void actionPerformed (ActionEvent e)
    {
	if (e.getActionCommand ().equals ("pressed") && num == 1)
	{
	    i = ("*Ahem* Do NOT press the red button.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 2)
	{
	    i = ("Don't do it.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 3)
	{
	    i = ("Seriously.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 4)
	{
	    i = ("Not this again.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 5)
	{
	    i = ("... you pressed it again. Do NOT press the button.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 6)
	{
	    i = ("...this displeases me.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 7)
	{
	    i = ("Quick! What's that behind you.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 8)
	{
	    i = ("All right, press it again. See if I care.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 9)
	{
	    i = ("Again.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 10)
	{
	    i = ("Do it again.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 11)
	{
	    i = ("Click it!");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 12)
	{
	    i = ("And again.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 13)
	{
	    i = ("OK, that's enough. You've got your fill.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 14)
	{
	    i = ("I mean it. It's time to stop pressing it.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 15)
	{
	    i = ("You see, this is why we can't be friends.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 16)
	{
	    i = ("You are just too selfish.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 17)
	{
	    i = ("Now you've asked for it. DoNoT pReSs It AgAiN!");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 18)
	{
	    i = ("You seem immune to my mind control.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 19)
	{
	    i = ("Time for Plan B. Press it. You know you want to.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 20)
	{
	    i = ("See that reverse psychology! Oh wait, it didn't work.");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 21)
	{
	    i = ("Really? aren't you getting bored yet?");
	    num++;
	}
	else if (e.getActionCommand ().equals ("pressed") && num == 22)
	{
	    i = ("Don't you have anything else to do?");
	    num = 1;
	}
	inst.setText ("                                       " + i + "                                       ");
	





    }


    protected static ImageIcon createImageIcon (String path)
    {
	java.net.URL imgURL = donotclickredbutton.class.getResource (path);
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



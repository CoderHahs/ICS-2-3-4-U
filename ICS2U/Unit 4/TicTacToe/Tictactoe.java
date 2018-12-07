import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.applet.Applet;
public class Tictactoe extends Applet implements ActionListener
{
    public void init ()
    {
	resize (183, 190);
	setBackground (Color.orange);
	JLabel welcome = new JLabel ("Tic-Tac-Toe");
	welcome.setFont (new Font ("Arial", Font.BOLD, 24));
	JLabel inst = new JLabel ("X has the next move. Click in"); 
	JLabel inst1 = new JLabel ("the WORST place they could go.");
	inst.setFont (new Font ("Arial", Font.PLAIN, 10));
	inst1.setFont (new Font ("Arial", Font.PLAIN, 10));
	JButton b1 = new JButton ("1");
	JButton b2 = new JButton ("2");
	JButton b3 = new JButton ("3");
	JButton b4 = new JButton ("4");
	JButton o = new JButton ("o");
	o.setBackground (Color.red);
	o.setForeground (Color.yellow);
	JButton b5 = new JButton ("5");
	JButton b6 = new JButton ("6");
	JButton x = new JButton ("x");
	x.setBackground (Color.blue);
	x.setForeground (Color.yellow);
	JButton b7 = new JButton ("7");
	x.setBackground (Color.blue);
	x.setForeground (Color.yellow);
	add (welcome);
	add (inst);
	add (inst1);
	add (b1);
	add (b2);
	add (b3);
	add (b4);
	add (o);
	add (b5);
	add (b6);
	add (x);
	add (b7);
    }


    public void actionPerformed (ActionEvent e)
    {
    }
}

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;

public class stroopeffect extends Applet implements ActionListener
{
    String names[] = {"Black", "Green", "Red", "Blue", "Magenta", "Yellow", "Orange", "Cyan"};
    Color colours[] = {Color.black, Color.green, Color.red, Color.blue, Color.magenta, Color.yellow, Color.orange, Color.cyan};
    int i = (int) (Math.random () * 7) + 1;
    int x = (int) (Math.random () * 7) + 1;
    JLabel q;

    public void init ()
    {
	resize (200, 150);
	JLabel title = new JLabel ("Call out the COLOUR, not the word.");
	q = new JLabel ("   " + names [i]);
	q.setPreferredSize (new Dimension (200, 50));
	q.setFont (new Font ("Arial", Font.BOLD, 40));
	q.setForeground (colours [x]);
	JButton b = new JButton ("New Clue");
	b.addActionListener (this);
	b.setActionCommand ("n");

	add (title);
	add (q);
	add (b);
    }


    public void actionPerformed (ActionEvent e)
    {
	i = (int) (Math.random () * 7) + 1;
	x = (int) (Math.random () * 7) + 1;

	q.setText ("   " + names [i]);
	q.setForeground (colours [x]);

    }
}

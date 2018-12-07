import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class countmein extends Applet implements ActionListener
{
  int num = 0;
  JLabel number;
  public void init ()
  {
    resize (240, 220);
    JLabel title = new JLabel ("Count Me In");
    title.setFont (new Font ("Arial", Font.PLAIN, 40));
    number = new JLabel ("          " + num + "          ");
    number.setFont (new Font ("Arial", Font.BOLD, 70));
    number.setForeground (Color.blue);
    JButton plus = new JButton ("+");
    plus.setFont (new Font ("Arial", Font.PLAIN, 25));
    plus.setForeground (Color.blue);
    plus.setBackground (Color.green);
    plus.setActionCommand ("plus");
    plus.addActionListener (this);
    JButton minus = new JButton ("-");
    minus.setFont (new Font ("Arial", Font.PLAIN, 25));
    minus.setForeground (Color.blue);
    minus.setBackground (Color.red);
    minus.setActionCommand ("minus");
    minus.addActionListener (this);
    JLabel i = new JLabel ("Press the button, we keep count for you!");
    
    add (title);
    add (number);
    add (plus);
    add (minus);
    add (i);
    
  }
  
  
  public void actionPerformed (ActionEvent e)
  {
    if (e.getActionCommand ().equals ("plus"))
      num++;
    else
      num--;
    number.setText ("          " + num + "          ");
    
  }
  
  
  protected static ImageIcon createImageIcon (String path)
  {
    java.net.URL imgURL = countmein.class.getResource (path);
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
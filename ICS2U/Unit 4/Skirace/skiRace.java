import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class skiRace extends Applet implements ActionListener
{
  public void init ()
  {
    resize (600,600);
    setBackground (Color.cyan);
    JLabel title = new JLabel ("Ski Race Puzzle!");
    title.setFont (new Font("Arial", Font.PLAIN, 40));
    JLabel pic1 = new JLabel (createImageIcon ("SkiRace.jpg"));
    JLabel i = new JLabel ("Enter the number of points beside each skier.                                                                                              ");
    JLabel pic2 = new JLabel (createImageIcon ("SkiRace1.jpg"));
    JTextField p2 = new JTextField (3);
    JLabel pic3 = new JLabel (createImageIcon ("SkiRace2.jpg"));
    JTextField p3 = new JTextField (3);
    JLabel pic4 = new JLabel (createImageIcon ("SkiRace3.jpg"));
    JTextField p4 = new JTextField (3);
    JLabel pic5 = new JLabel (createImageIcon ("SkiRace4.jpg"));
    JTextField p5 = new JTextField (3);
    JButton done = new JButton ("Done");
    done.setForeground(Color.blue);
    add (title);
    add (pic1);
    add (i);
    add (pic2);
    add (p2);
    add (pic3);
    add (p3);
    add (pic4);
    add (p4);
    add (pic5);
    add (p5);
    add (done);
  }
  
  
  public void actionPerformed (ActionEvent e)
  {
  }
  
  
  protected static ImageIcon createImageIcon (String path)
  {
    java.net.URL imgURL = skiRace.class.getResource (path);
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

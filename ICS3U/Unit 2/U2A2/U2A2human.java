/*
By Hrithik Shah
Date: July 9, 2016
Title: Pizza Price Calculator
Purpose: Calculating the price of pizzas.
*/

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class U2A2human extends Applet implements ActionListener
{

    JTextField diameter;
    JLabel finalprice;
    public void init ()
    {
	resize (350, 300);

	JLabel title = new JLabel ("Pizza Price Calculator");
	title.setFont (new Font ("Arial", Font.BOLD, 30));
	title.setForeground (Color.red);
	Panel pdiameter = new Panel ();
	JLabel ediameter = new JLabel ("\n\n Please enter the diameter of the pizza in inches:                  ");
	diameter = new JTextField (4);
	JButton calculate = new JButton ("Calculate");
	calculate.addActionListener (this);
	calculate.setActionCommand ("cal");
	finalprice = new JLabel ("\n\n                                                                             ");
	finalprice.setFont (new Font ("Arial", Font.PLAIN, 18));
	finalprice.setForeground (Color.black);

	add (title);
	pdiameter.add (ediameter);
	pdiameter.add (diameter);
	add (pdiameter);
	add (calculate);
	add (finalprice);

    }


    public void actionPerformed (ActionEvent e)
    {

	int d = Integer.parseInt (diameter.getText ());

	if (e.getActionCommand ().equals ("cal"))
	{
	    double labour = 1.00;
	    double store = 1.50;
	    double materials = 0.50*d;
	    double cost = labour+store+materials;
	    finalprice.setText ("The cost of the pizza is " + finalprice);
       }
    }
}

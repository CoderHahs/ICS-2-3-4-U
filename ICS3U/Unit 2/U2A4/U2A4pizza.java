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
import java.text.DecimalFormat;

public class U2A4pizza extends Applet implements ActionListener
{
    // Global Variables
    JTextField diameter;
    JLabel finalprice;

    public void init ()
    {
	resize (400, 200);

	// Variables for screen
	JLabel title = new JLabel ("Pizza Price Calculator");
	title.setFont (new Font ("Arial", Font.BOLD, 30));
	title.setForeground (Color.red);
	Panel pdiameter = new Panel ();
	JLabel ediameter = new JLabel ("\n\n Please enter the diameter of the pizza in inches:        ");
	diameter = new JTextField (4);
	JButton calculate = new JButton ("Calculate");
	calculate.addActionListener (this);
	calculate.setActionCommand ("cal");
	finalprice = new JLabel ("\n\n                                                                             ");
	finalprice.setFont (new Font ("Arial", Font.PLAIN, 18));
	finalprice.setForeground (Color.black);

	// adding variables to screen
	add (title);
	pdiameter.add (ediameter);
	pdiameter.add (diameter);
	add (pdiameter);
	add (calculate);
	add (finalprice);

    }


    public void actionPerformed (ActionEvent e)
    {

	double d = Double.parseDouble (diameter.getText ());
	DecimalFormat two = new DecimalFormat ("#.00");

	if (e.getActionCommand ().equals ("cal"))
	{
	    // calculations
	    double labour = 1.00;
	    double store = 1.50;
	    double materials = Math.round ((0.50 * d) * 100.0) / 100.0;
	    double cost = labour + store + materials;

	    // conclusion
	    finalprice.setText ("            The cost of the pizza is $" + two.format (cost) + ".");
	}
    }
}

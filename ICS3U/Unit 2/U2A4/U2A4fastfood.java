/*
By Hrithik Shah
July 9 2016
Fast Food
Creating an order application for a fast food restaurant
*/

public class U2A4fastfood
{
    public static void main (String[] args)
    {
	new U2A4fastfood ();
    }


    public U2A4fastfood ()
    {
	// ask for user input
	int b = IBIO.inputInt ("Enter the number of burgers: ");
	int f = IBIO.inputInt ("Enter the number of fries: ");
	int sd = IBIO.inputInt ("Enter the number of soft drinks: ");

	// calculations
	double costwot = Math.round (((b * 2.49) + (f * 1.89) + (sd * 0.99)) * 100.0) / 100.0;
	double tax = Math.round ((costwot * 0.13) * 100.0) / 100.0;
	double costwt = Math.round ((costwot + tax)*100.0)/100.0;

	// output
	System.out.println ("Total before taxes: $" + costwot);
	System.out.println ("Tax: $" + tax);
	System.out.println ("Final total: $" + costwt);

	// payment + change
	double payment = IBIO.inputDouble ("Enter amount tendered: $");
	double change = Math.round ((payment - costwt) * 100.0) / 100.0;
	System.out.println ("Change: $" + change);



    }
}


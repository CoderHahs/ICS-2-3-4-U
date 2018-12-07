/*
By Hrithik Shah
Date: July 10, 2016
Title: Random Numbers
Purpose: Generate random numbers
*/

public class U2A4randomnumbers
{
    public static void main (String[] args)
    {
	new U2A4randomnumbers ();
    }


    public U2A4randomnumbers ()
    {
	int n1 = IBIO.inputInt ("Enter a minimum value (integer): ");
	int n2 = IBIO.inputInt ("Enter a maximum value (integer): ");

	int random = (int) (Math.random () * n2 + n1);
	System.out.println ("The random number generated was " + random);
    }
}


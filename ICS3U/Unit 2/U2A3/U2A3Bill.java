/*
By Hrithik Shah
July 8 2016
Unit 2 Assignment 3
Creating a bill for a restaurant
*/

public class U2A3Bill
{
    public static void main (String[] args)
    {
	new U2A3Bill ();
    }


    public U2A3Bill ()
    {
	double meal = 10.50;
	double tax = Math.round ((10.50 * 0.13) * 100.0) / 100.0;
	double totalbill = Math.round ((meal + tax) * 100.0) / 100.0;
	System.out.println ("********Restaurant Bill********\n\n  Meal:  \t\t$" + meal + "\n  HST: \t\t\t$" + tax + " \n  Total: \t\t$" + totalbill + "\n\n*******HAVE A GREAT DAY*******");
    }
}


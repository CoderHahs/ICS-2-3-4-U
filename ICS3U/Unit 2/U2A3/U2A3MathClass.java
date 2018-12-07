/*
By Hrithik Shah
July 8 2016
Unit 2 Assignment 3
Researching and using new Math Methods
*/
public class U2A3MathClass
{

    public static void main (String[] args)
    {

	// Declare Variables
	double myNumber1, myNumber2;
	double squareRoot, highestValue, circleArea, randomNumber;
	int modnumber;
	double ceilnumber, floornumber;

	System.out.println ("Math Class Methods");
	System.out.println ("******************\n");

	// round() Method
	myNumber1 = Math.round (7.5342);
	System.out.println ("7.5342 is rounded to " + myNumber1);
	myNumber2 = Math.round (10.4999);
	System.out.println ("10.4999 is rounded to " + myNumber2 + "\n");

	// sqrt() Method
	squareRoot = Math.sqrt (36);
	System.out.println ("The squareroot of 36 is " + squareRoot + "\n");

	// max() Method
	highestValue = Math.max (10, 20);
	System.out.println ("The maximum value of 10,20 is " + highestValue + "\n");

	// This example uses several Math Methods and a Math constant - PI
	circleArea = Math.round (Math.PI * Math.pow (8, 2));
	System.out.println ("The area of a circle with a radius of 8 is " + circleArea + "\n");

	// random() Method
	randomNumber = Math.random ();
	System.out.println ("The random number generated is: " + randomNumber + "\n");

	// NEW METHODS

	// Modding a number gives you the remainder of division.
	modnumber = 10 % 3;
	System.out.println ("The remainder when 10 is divded by 3 is " + modnumber + "\n");

	// ceil () Method (number is rounded up)
	ceilnumber = Math.ceil (6.32);
	System.out.println ("6.32 when rounded up is " + ceilnumber + "\n");

	// floor () Method (number is rounded down)
	floornumber = Math.floor (6.32);
	System.out.println ("6.32 when rounded down is " + floornumber + "\n");



    }
}

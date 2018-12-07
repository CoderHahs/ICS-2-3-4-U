//Fill in the methods at the bottom to make the program run correctly

public class area
{
    public static void main (String args[])
    {
	new area ();
    }


    public area ()
    {
	char more = 'y';

	while (more == 'Y' || more == 'y')
	{
	    printmenu ();
	    int answer = IBIO.inputInt ("Which object do you have? (1-5) ");
	    double area = -1;
	    if (answer == 1)
		area = circle ();
	    else if (answer == 2)
		area = rectangle ();
	    else if (answer == 3)
		area = triangle ();
	    else if (answer == 4)
		area = square ();
	    else if (answer == 5)
		area = sphere ();

	    if (area == -1)
		System.out.println ("You must choose 1 to 5.");
	    else
		System.out.println ("The area is " + area);

	    System.out.println ("");
	    more = IBIO.inputChar ("Do you want to find the area of anything else? (y/n) ");
	} //while

	System.out.println ("Goodbye!");
    } //constructor


    public void printmenu ()
    {
	//Add the Code to print the menu:
	System.out.println ("*** Menu ***");
	System.out.println ("1. circle");
	System.out.println ("2. rectangle");
	System.out.println ("3. triangle");
	System.out.println ("4. square");
	System.out.println ("5. sphere");
	
    }


    public double circle ()
    { //Code to get info needed and calculate area of a circle
	double r = IBIO.inputDouble ("Enter the radius: ");
	double circlearea = Math.PI*Math.pow(r,2);
	//change the return line to return the area you calculated
	return circlearea;
    } //circle


    public double rectangle ()
    { //Code to get info needed and calculate area of a rectangle
	double width = IBIO.inputDouble ("Enter the width: ");
	double length = IBIO.inputDouble ("Enter the lengh: ");
	double rectanglearea = width * length;
	//change the return line to return the area you calculated
	return rectanglearea;
    } //rectangle


    public double triangle ()
    { //Code to get info needed and calculate area of a triangle
	double base = IBIO.inputDouble ("Enter the base length: ");
	double height = IBIO.inputDouble ("Enter the height: ");
	double trianglarea = (base*height) /2;
	//change the return line to return the area you calculated
	return trianglarea;
    } //triangle


    public double square ()
    { //Code to get info needed and calculate area of a square
	double length = IBIO.inputDouble ("Enter the side length: ");
	double squarearea = length*length;
	//change the return line to return the area you calculated
	return squarearea;
    } //square


    public double sphere ()
    { //Code to get info needed and calculate surface area of a sphere
	double radius = IBIO.inputDouble ("Enter the radius: ");
	double spherearea = Math.pow (radius, 3) * Math.PI * 4/3;
	//change the return line to return the surface area you calculated
	return spherearea;
    } //sphere
} //class

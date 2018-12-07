public class quadMethods
{
    public static void main (String args[])
    {
	new quadMethods ();
    }


    public quadMethods ()
    {
	printNStars (5);
	printNChars (6, 'q');
	System.out.println ("The positive root is: " + positiveRoot (1, 6, 8));
	System.out.println ("The negative root is: " + negativeRoot (1, 6, 8));
	System.out.println ("The x value of the vertex is: " + xVertex (1, 6, 8));
	System.out.println ("The discriminant is: " + discrim (1, 6, 8));
	System.out.println ("The number of roots is: " + numRoots (1, 6, 8));
	System.out.println ("The absolute value of: " + absValue (-4));
    }


    public void printNStars (int n)
    { //prints 'n' stars on the screen in a row
	for (int i = 1 ; i <= n ; i++)
	    System.out.print ("* ");
	System.out.println ("");
    }


    public void printNChars (int n, char c)
    { //prints 'n' of character c on the screen in a row
	for (int i = 1 ; i <= n ; i++)
	    System.out.print (c + " ");
	System.out.println ("");
    }


    public double positiveRoot (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the positive root of the quadratic equation
	//(-b+Math.sqt(b*b-4*a*c))/2*a
	//replace the return 1
	double value = (-b + Math.sqrt (b * b - 4 * a * c)) / 2 * a;

	return value;
    }


    public double negativeRoot (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the positive root of the quadratic equation
	//(-b-Math.sqt(b*b-4*a*c))/2*a
	//replace the return 1
	double value = (-b - Math.sqrt (b * b - 4 * a * c)) / 2 * a;
	return value;
    }


    public double xVertex (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the x value of the vertex of the quadratic equation
	//-b/(2*a)
	//replace the return 1
	double value = -b / (2 * a);
	return value;

    }


    public double discrim (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the discriminant of the quadratic equation
	//b*b-4*a*c
	//replace the return 1
	double value = b * b - 4 * a * c;
	return value;
    }


    public int numRoots (double a, double b, double c)
    { //assumes ax^2+bx+c=0
	//returns the number of roots for the quadratic equation
	//call discrim method, make an if to return 0, 1, or 2.
	//replace the return 1
	double value = b * b - 4 * a * c;
	discrim (a, b, c);
	if (value == 0)
	    return 1;
	else if (value < 0)
	    return 0;
	else
	    return 2;

    }


    public int absValue (int n)
    { //returns the absValue of n
	//replace the return 1
	int value = n;
	if (n < 0)
	{
	    value = n * (-1);
	}
	return value;
    }
}


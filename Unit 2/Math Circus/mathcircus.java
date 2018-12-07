public class mathcircus
{
    public static void main (String args[])
    {
	new mathcircus ();
    }


    public void printmenu ()
    {
	System.out.println ("******Menu Options******");
	System.out.println ("a) Addition ");
	System.out.println ("b) Subtraction ");
	System.out.println ("c) Multiplication ");
	System.out.println ("d) Division ");
	System.out.println ("q) Quit ");
    }


    public mathcircus ()
    {
	char choice = 't';
	int acounter = 0;
	int qcounter = 0;

	while (choice != 'q')
	{
	    System.out.println ("You have " + acounter + " out of " + qcounter + " questions correct.");
	    int a = (int) (Math.random () * 10) + 1;
	    int b = (int) (Math.random () * 10) + 1;


	    printmenu ();
	    choice = IBIO.inputChar ("Choice> \n");




	    if (choice == 'a')
	    {
		int guess = 0;
		int ans = a + b;
		guess = IBIO.inputInt (a + "+" + b + "=");
		if (guess == ans)
		{
		    acounter++;


		}
		else
		{


		}


	    }
	    else if (choice == 'b')
	    {
		int guess = 0;
		int ans = a - b;
		if (a >= b)
		{
		    guess = IBIO.inputInt (a + "-" + b + "=");
		    ans = a - b;
		}
		else
		{
		    guess = IBIO.inputInt (b + "-" + a + "=");
		    ans = b - a;
		}
		if (guess == ans)
		{
		    acounter++;


		}
		else
		{


		}

	    }
	    else if (choice == 'c')
	    {
		int guess = 0;
		int ans = a * b;
		guess = IBIO.inputInt (a + "x" + b + "=");
		if (guess == ans)
		{
		    acounter++;


		}
		else
		{


		}

	    }
	    else if (choice == 'd')
	    {
		int guess = 0;
		int ans = a / b;
		if (a >= b)
		{
		    ans = a;
		    guess = IBIO.inputInt ((a * b) + "/" + b + "=");
		}
		else
		{
		    ans = b / a;
		    guess = IBIO.inputInt ((b * a) + "/" + a + "=");
		}
		if (guess == ans)
		{
		    acounter++;


		}
		else
		{


		}

	    }
	    else if (choice != 'q')
	    {
		System.out.println ("Error. Please try again.");

	    }
	    else
	    {
		System.out.println ("\nThank you for playing!\nGoodbye.");
	    }
	    qcounter++;


	}

    }
}

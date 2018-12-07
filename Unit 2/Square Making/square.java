public class square
{
    public static void main (String args[])
    {
	new square ();
    }


    public square ()
    {
	System.out.println ("---Welcome to the Square Making Program---");
	System.out.println ("\nYou want squares, we make squares!");

	int while1 = 1;

	while (while1 < 10000000)
	{
	    int dimension = IBIO.inputInt ("\nWhat dimension of square? (-1 to quit)");
	    while1++;
	    if (dimension == -1)
	    {
		System.out.println ("\nGoodbye! \n Hope you enjoyed making squares.");
		while1 = 10000001;
	    }
	    else
	    {

		for (int i = dimension ; i >= 1 ; i--)
		{
		    for (int x = dimension - 1 ; x >= 1 ; x--)
		    {
			System.out.print ("* ");
		    }
		    System.out.println ("* ");

		}

	    }
	}

    }
}
